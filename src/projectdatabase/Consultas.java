/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatabase;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class Consultas {

    public ArrayList select() {
        ArrayList<Modelo> aux = new ArrayList();
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.rs = Conexion.s.executeQuery("select * from alumnos");
            while (Conexion.rs.next()) {
                aux.add(new Modelo(
                        Integer.parseInt(Conexion.rs.getString("coda")),
                        Conexion.rs.getString("nombre"), 
                        Integer.parseInt(Conexion.rs.getString("nota"))));
            }
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
        return aux;
    }

    public void insert(int coda, String nomb, int nota) {
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.s.executeUpdate("INSERT INTO alumnos values (" + coda + ",'" + nomb + "'," + nota + ')');
            //Confirmacion
            System.out.println("Inserción realizada");
        } catch (SQLIntegrityConstraintViolationException ex) {
            System.out.println("ERROR CLAVE REPETIDA ---> " + ex);
            //En caso de que repitamos la primary key volvera a lanzar el metodo
            insert(Metodos.cod(), Metodos.nombre(), Metodos.nota());
        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }

    public void delete(int cod) {
        try {
            //Declarar consulta
            Conexion.s = Conexion.con.createStatement();
            //Ejecutar consulta
            Conexion.s.executeUpdate("delete from alumnos where coda=" + cod);
            //Confirmacion
            System.out.println("Borrado realizado");

        } catch (SQLException ex) {
            System.out.println("ERROR ---> " + ex);
        }
    }
}
