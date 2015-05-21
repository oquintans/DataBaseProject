/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatabase;

/**
 *
 * @author oquintansocampo
 */
public class Modelo {

    private int cod;
    private String nombre;
    private int nota;

    public Modelo() {
    }

    public Modelo(int cod, String nombre, int nota) {
        this.cod = cod;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Modelo{" + "cod=" + cod + ", nombre=" + nombre + ", nota=" + nota + '}';
    }

}
