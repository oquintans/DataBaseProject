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
    public static String nombTab(){
        String nTab;
        nTab=JOptionPane.showInputDialog("Introduzca el nombre de la tabla.");
        return nTab;
    }
}
