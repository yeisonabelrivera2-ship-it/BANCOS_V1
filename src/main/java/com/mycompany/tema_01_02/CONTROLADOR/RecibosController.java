
package com.mycompany.tema_01_02.CONTROLADOR;

import com.mycompany.tema_01_02.MODELO.Recibos;
import java.sql.*;
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
    
    
}
