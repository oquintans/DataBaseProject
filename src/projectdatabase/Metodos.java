/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatabase;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Metodos {

//    public static String nombTab() {
//        String nTab;
//        nTab = JOptionPane.showInputDialog("Introduzca el nombre de la tabla.");
//        return nTab;
//    }

    public static String nombre() {
        String nombre;
        nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno.");
        return nombre;
    }

    public static int nota() {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota del alumno."));
        return nota;
    }

    public static int cod() {
        int cod;
        cod = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el código del alumno."));
        return cod;
    }
}
