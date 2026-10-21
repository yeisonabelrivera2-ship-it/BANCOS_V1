
package com.mycompany.tema_01_02.CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection con;
    
    //DATOS DE CONEXION
    private static final String host = "localhost";
    private static final String port = "3307";
    private static final String sid = "xe";
    public static final String bd = "BANCOS";
    private static final String user = "BANCOS";
    private static final String psw = "BANCOS";
    
    //3306 port mysql//
    //METODO DE CONEXION
    public Connection conectar() 
    {
        try 
        {
            String url = "jdbc:mysql://" + host + ":" + port + "/" + bd;
            con = DriverManager.getConnection(url, user, psw);
            System.out.println("Conexion correcta");
            return con;
        } 
        catch (SQLException sqle) 
        {
            System.out.println("Error: credenciales erroneas o base apagada");
            sqle.printStackTrace();
        }
       
        return null;
    }
}
