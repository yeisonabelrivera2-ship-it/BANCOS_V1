
package com.mycompany.tema_01_02.CONTROLADOR;

import com.mycompany.tema_01_02.CONEXION.Conexion;
import com.mycompany.tema_01_02.MODELO.Fpago;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FpagoController {
    
    private Connection con;
    
    public FpagoController(Connection con)
    {
        this.con = con;
    }

    
    public ArrayList<Fpago> readAll() throws SQLException
    {
        ArrayList<Fpago> lista = new ArrayList<>();
        String sql = "SELECT CCODFPAGO, CDESFPAGO, NRECIBOS FROM FPAGO";
        
        try (PreparedStatement st = con.prepareStatement(sql);
             ResultSet rs = st.executeQuery())
        {
            while (rs.next()) 
            {                
                Fpago fp = new Fpago(rs.getString("CCODFPAGO"),
                                     rs.getString("CDESFPAGO"),
                                     rs.getLong("NRECIBOS"));
                lista.add(fp);
            }
        }         
        return lista;   
    }
    
    
    public Fpago readById(String id) throws SQLException
    {
        Fpago fp = null;
        String sql = "SELECT CCODFPAGO, CDESFPAGO, NRECIBOS FROM FPAGO WHERE ccodfpago = ?";
        
        try(PreparedStatement st = con.prepareStatement(sql)) 
        {
            st.setString(1, id);
            
            try(ResultSet rs = st.executeQuery())
            {
                if (rs.next()) 
                {
                    fp = new Fpago(rs.getString("CCODFPAGO"),
                           rs.getString("CDESFPAGO"),
                           rs.getLong("NRECIBOS"));
                }
            }
        } 
        return fp;
    }
    
    
    
    public int create(Fpago fp) throws SQLException
    {
        int filasAfectadas = 0;
        String sql = "INSERT INTO FPAGO(CCODFPAGO, CDESFPAGO, NRECIBOS) VALUES(?, ?, ?)";
       
        try(PreparedStatement st = con.prepareStatement(sql)) 
        {
            st.setString(1, fp.getCCODFPAGO());
            st.setString(2, fp.getCDESFPAGO());
            st.setLong(3, fp.getNRECIBOS());
            
            filasAfectadas = st.executeUpdate();
        }
        return filasAfectadas;
    }
    
    
    public int deleteById(String id)throws SQLException
    {
        int filasAfectadas = 0;
        String sql = "DELETE FROM FPAGO WHERE CCODFPAGO = ?";
        
        try(PreparedStatement st = con.prepareStatement(sql)) 
        {
            st.setString(1, id);
                    
            filasAfectadas = st.executeUpdate();
        } 
        
        return filasAfectadas;
    }
    
    public int update(Fpago fp)
    {
        int filasAfectadas = 0;
        String sql = "UPDATE FPAGO SET CDESFPAGO = ?, NRECIBOS = ? WHERE CCODFPAGO = ?";
        
        try (PreparedStatement st = con.prepareStatement(sql))
        {
            st.setString(1, fp.getCDESFPAGO());
            st.setLong(2, fp.getNRECIBOS());
            st.setString(3, fp.getCCODFPAGO());
            
            filasAfectadas = st.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return filasAfectadas;
    }
}
