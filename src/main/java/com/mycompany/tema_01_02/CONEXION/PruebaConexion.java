
package com.mycompany.tema_01_02.CONEXION;

import java.sql.Connection;


public class PruebaConexion {
    
    public static void main(String[] args)
    {
        Conexion conexion = new Conexion();
        Connection con = conexion.conectar();
        
        if (con != null) 
        {
            System.out.println("CORRECTO: prueba realizada correctamente");
        }
        else
        {
            System.out.println("ERROR: no se pudo conectar a oracle");
        }
    }
    
}
