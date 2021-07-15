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
public class Administrativo extends Empleado {
    private int facultad;

    public Administrativo() {
    }

    public Administrativo(int facultad, String antiguedad, String apellidos, int codigo, String nombres, float salario) {
        super(antiguedad, apellidos, codigo, nombres, salario);
        this.facultad = facultad;
    }

    public Administrativo(String años, String cerna, int i, String katy, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getFacultad() {
        return facultad;
    }

    public void setFacultad(int facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Administrativo{" + "facultad=" + facultad + '}';
    }
    

}
