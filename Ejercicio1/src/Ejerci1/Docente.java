/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerci1;

/**
 *
 * @author Admin
 */
public class Docente extends Empleado {
    private String titulo;

    public Docente() {
    }

    public Docente(String titulo, String antiguedad, String apellidos, int codigo, String nombres, float salario) {
        super(antiguedad, apellidos, codigo, nombres, salario);
        this.titulo = titulo;
    }

    public Docente(String años, String romero, int i, String josue, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Docente{" + "titulo=" + titulo + '}';
    }

    
}
