
package com.mycompany.tema_01_02.CONTROLADOR;

import com.mycompany.tema_01_02.MODELO.Recibos;
import java.sql.*;
import static java.sql.JDBCType.INTEGER;
import java.time.LocalDate;
import java.util.ArrayList;


// DELETEBYID, FindByID,

public class RecibosController {
    
    private Connection con;
    
    public RecibosController(Connection con)
    {
        this.con = con;
    }
    
    public ArrayList<Recibos> findById(String id){
        ArrayList<Recibos> listaRecibos = new ArrayList<>();
        
        String sql = "SELECT NNUMPREST, NNUMRECIB, DFECREC, NIMPREC, DFECPAGO FROM RECIBOS WHERE NNUMPREST = ?;";
        
        try(PreparedStatement st = con.prepareStatement(sql)) 
        {
            st.setString(1, id);
            
            try(ResultSet rs = st.executeQuery())
            {
                while(rs.next())
                {
                    
                    java.sql.Date fechaPago = rs.getDate("DFECPAGO");

                    Recibos rb = new Recibos(rs.getInt("NNUMPREST"),
                                             rs.getInt("NNUMRECIB"),
                                             rs.getDate("DFECREC").toLocalDate(),
                                             rs.getInt("NIMPREC"),
                    fechaPago == null ? null : fechaPago.toLocalDate()
                );

                listaRecibos.add(rb);
                }
            }
        } 
        catch (SQLException ex) 
        { 
            ex.printStackTrace();
        }
        return listaRecibos;
    }
    
    //Borra solo un prestamo seleccionado, con el Codigo del prestamo y del recibo
    //Si un recibo esta pagado no se puede borrar, comprobar con tieneRecibosPagados
    public int deleteById(int numPrest, int numRecib) {
        int filasAfectadas = 0;
        String sql = "DELETE FROM RECIBOS WHERE NNUMPREST = ? AND NNUMRECIB = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, numPrest);
            st.setInt(2, numRecib);

            filasAfectadas = st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el recibo");
            ex.printStackTrace();
        }
        return filasAfectadas;
    }
    
    //Borra todos los recibos de un prestamo
    //Si un recibo esta pagado no se puede borrar, comprobar con tieneRecibosPagados

    public int deleteByPrestamoId(int numPrest) {
        int filasAfectadas = 0;
        String sql = "DELETE FROM RECIBOS WHERE NNUMPREST = ?";
        
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, numPrest);
            filasAfectadas = st.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error al eliminar los recibos del prestamo");
            ex.printStackTrace();
        }
        return filasAfectadas;
    }
    
    
    // Comprueba que un prestamo no tenga recibos pagados
    // SI EXISTEN RECIBOS PAGADOS SE DEVUELVE TRUE, POR LO QUE NO SE DEBEN DE BORRAR
    // El metodo pregunta a la base de datos el numero de recibos que estan pagados, si hay al menos uno, devuelve true.
    public boolean tieneRecibosPagados(int numPrest) {
            String sql = "SELECT COUNT(*) FROM recibos WHERE nNumPrest = ? AND dFecPago IS NOT NULL";

            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setInt(1, numPrest);

                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    int totalPagados = rs.getInt(1);

                    if (totalPagados > 0) {
                        return true;
                    }
                }
            } catch  (SQLException e) {
                 e.printStackTrace();
            }
            
            return false;
        }
    
    
    public int generarRecibos(String id){
        
        int resultado = 0;
        
        String sql = "{CALL sp_GENERARRECIBOS(?, ?)}";
        
        try (CallableStatement cs = con.prepareCall(sql)){

            cs.setString(1, id);
            cs.registerOutParameter(2, INTEGER);
            
            cs.execute();

            resultado = cs.getInt(2);
            
        } catch (SQLException ex) {
            System.out.println("Error al general el recibo");
        }
        
        return resultado;
    }
    
    public int pagarRecibo(int numPrest, int numRecib, LocalDate fechaPago) {
        int filasAfectadas = 0;
        String sql = "UPDATE RECIBOS SET DFECPAGO = ? WHERE NNUMPREST = ? AND NNUMRECIB = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setDate(1, Date.valueOf(fechaPago));
            st.setInt(2, numPrest);
            st.setInt(3, numRecib);

            filasAfectadas = st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al pagar el recibo");
            ex.printStackTrace();
        }
        return filasAfectadas;
    }
    
}
