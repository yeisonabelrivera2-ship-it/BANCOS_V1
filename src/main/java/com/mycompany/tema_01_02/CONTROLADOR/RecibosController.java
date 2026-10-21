
package com.mycompany.tema_01_02.CONTROLADOR;

import com.mycompany.tema_01_02.MODELO.Recibos;
import java.sql.*;
import static java.sql.Types.*;
import java.util.ArrayList;

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
                    
                    Recibos rb = new Recibos(rs.getInt("NNUMPREST"), 
                    rs.getInt("NNUMRECIB"), 
                    rs.getDate("DFECREC").toLocalDate(), 
                    rs.getInt("NIMPREC"), 
                    rs.getDate("DFECPAGO").toLocalDate());
                    
                    listaRecibos.add(rb);
                }
            }
        } catch (SQLException ex) { 
            System.out.println("Error al buscar los recibos");;
        }
        return listaRecibos;
    }
    
    
    public int deleteById(String id)
    {
        int filasAfectadas = 0;
        String sql = "DELETE FROM RECIBOS WHERE NNUMRECIB = ?";
        
        try(PreparedStatement st = con.prepareStatement(sql)) 
        {
            st.setString(1, id);
                    
            filasAfectadas = st.executeUpdate();
        } catch (SQLException ex) { 
            System.getLogger(RecibosController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        return filasAfectadas;
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
    
    
}
