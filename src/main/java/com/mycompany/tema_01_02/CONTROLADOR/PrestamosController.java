package com.mycompany.tema_01_02.CONTROLADOR;

import com.mycompany.tema_01_02.MODELO.Prestamo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PrestamosController {
    private Connection con;

    public PrestamosController(Connection con) {
        this.con = con;
    }

    
    public ArrayList<Prestamo> readAll() {
            ArrayList<Prestamo> lista = new ArrayList<>();
            String sql = "SELECT NNUMPREST, DFECPREST, NIMPPREST, NIMPRECI, CCODFPAGO FROM PRESTAMOS";

            try (PreparedStatement st = con.prepareStatement(sql);
                 ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    Prestamo p = new Prestamo(
                        rs.getInt("NNUMPREST"),
                        rs.getDate("DFECPREST").toLocalDate(),
                        rs.getDouble("NIMPPREST"),
                        rs.getDouble("NIMPRECI"),
                        rs.getString("CCODFPAGO")
                    );
                    lista.add(p);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return lista;
        }
    
    
    public Prestamo readById(int id) {
        Prestamo p = null;
        String sql = "SELECT NNUMPREST, DFECPREST, NIMPPREST, NIMPRECI, CCODFPAGO FROM PRESTAMOS WHERE NNUMPREST = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, id);

            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    p = new Prestamo(
                            rs.getInt("NNUMPREST"),
                            rs.getDate("DFECPREST").toLocalDate(),
                            rs.getDouble("NIMPPREST"),
                            rs.getDouble("NIMPRECI"),
                            rs.getString("CCODFPAGO")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }
    
    
    public int create(Prestamo p) {
        int filasAfectadas = 0;
        String sql = "INSERT INTO PRESTAMOS(NNUMPREST, DFECPREST, NIMPPREST, NIMPRECI, CCODFPAGO) VALUES(?, ?, ?, ?, ?)";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, p.getNumPrest());
            st.setDate(2, Date.valueOf(p.getFecPrest()));
            st.setDouble(3, p.getImpPrest());
            st.setDouble(4, p.getImpReci());
            st.setString(5, p.getCodFPago());

            filasAfectadas = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filasAfectadas;
    }
    
    
    public int deleteById(int id) {
        int filasAfectadas = 0;
        String sql = "DELETE FROM PRESTAMOS WHERE NNUMPREST = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setInt(1, id);
            filasAfectadas = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filasAfectadas;
    }

    
    public int update(Prestamo p) {
        int filasAfectadas = 0;
        String sql = "UPDATE PRESTAMOS SET DFECPREST = ?, NIMPPREST = ?, NIMPRECI = ?, CCODFPAGO = ? WHERE NNUMPREST = ?";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setDate(1, Date.valueOf(p.getFecPrest()));
            st.setDouble(2, p.getImpPrest());
            st.setDouble(3, p.getImpReci());
            st.setString(4, p.getCodFPago());
            st.setInt(5, p.getNumPrest());

            filasAfectadas = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filasAfectadas;
    }
}
    

