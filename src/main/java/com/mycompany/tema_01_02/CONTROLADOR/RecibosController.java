
package com.mycompany.tema_01_02.CONTROLADOR;

import com.mycompany.tema_01_02.MODELO.Recibos;
import java.sql.*;

public class RecibosController {
    
    private Connection con;
    
    public RecibosController(Connection con)
    {
        this.con = con;
    }
    
    public Recibos findById(String id)

    {
        Recibos rb = null;
        String sql = "SELECT NNUMPREST, NNUMRECIB, DFECREC, NIMPREC, DFECPAGO FROM RECIBOS WHERE NNUMPREST = ?;";
        
        try(PreparedStatement st = con.prepareStatement(sql)) 
        {
            st.setString(1, id);
            
            try(ResultSet rs = st.executeQuery())
            {
                if (rs.next())
                {
                    rb = new Recibos(rs.getInt("NNUMPREST"), 
                    rs.getInt("NNUMRECIB"), 
                    rs.getDate("DFECREC").toLocalDate(), 
                    rs.getInt("NIMPREC"), 
                    rs.getDate("DFECPAGO").toLocalDate());
                }
            }
        } catch (SQLException ex) { 
            System.out.println("Error al buscar los recibos");;
        }
        return rb;
    }
    
    
}
