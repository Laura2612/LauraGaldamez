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
public class Empleado {
    private String antiguedad;
    private String apellidos;
    private int codigo;
    private String nombres;
    private float salario;

    public Empleado() {
    }

    public Empleado(String antiguedad, String apellidos, int codigo, String nombres, float salario) {
        this.antiguedad = antiguedad;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.nombres = nombres;
        this.salario = salario;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "antiguedad=" + antiguedad + ", apellidos=" + apellidos + ", codigo=" + codigo + ", nombres=" + nombres + ", salario=" + salario + '}';
    }
    
    
}
