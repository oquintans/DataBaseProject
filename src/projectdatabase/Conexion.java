/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatabase;

import java.sql.*;

/**
 *
 * @author Oscar
 */
public class Conexion {

    static Connection con = null;
    static Statement s = null;
    static ResultSet rs = null;

    public static Connection conDerby() {
        try {
            //Cargar Driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //Conectar a la base en derby
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/DataBaseProject", "root", "root");
            //Confirmamos conexion
            System.out.println("Conexión establecida con el servidor.");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("ERROR DE CONEXION ---> " + ex);
        }
        return con;
    }
}
