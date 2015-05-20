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
public class Consultas {

    public void select(String nTab) {
        try {
            Conexion.s = Conexion.con.createStatement();
            Conexion.rs = Conexion.s.executeQuery("select * from " + nTab);
            ResultSetMetaData rsmd = Conexion.rs.getMetaData();
            int nColumnas = rsmd.getColumnCount();
            while (Conexion.rs.next()) {
                for (int i = 1; i <= nColumnas; i++) {
                    if (i > 1) {
                        System.out.print(",  ");
                    }
                    String colValue = Conexion.rs.getString(i);
                    System.out.print(rsmd.getColumnName(i) + " " + colValue);
                }
                System.out.println("");
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("ERROR CLAVE REPETIDA ---> " + e);
            select(nTab);
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }
}
