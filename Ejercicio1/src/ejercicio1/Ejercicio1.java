/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Ejerci1.Administrativo;
import Ejerci1.Docente;
 import java.util.ArrayList;
 import Ejerci1.Empleado *;
 import Ejerci1.Empleado *;

/**
 *
 * @author Admin
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Empleado Fernanda = new Empleado("5años", "Gonzalez", 00001, "Fernanda", 4000);
        
        Empleado Josue = new Docente("Marketing", "6años", "Romero", 00003, "Josue", 6000);
        
        Empleado Katy = new Administrativo(0005, "10años", "Cerna", 00006, "Katy", 7382497);
        
            Empleado nuevoEmpleado = new Empleado();
            nuevoEmpleado.setAntiguedad(Fernanda.getAntiguedad());
            nuevoEmpleado.setNombres(Fernanda.getNombres());
            nuevoEmpleado.setApellidos(Fernanda.getApellidos());
            nuevoEmpleado.setCodigo(Fernanda.getCodigo());
            nuevoEmpleado.setSalario(Fernanda.getSalario());
            
                System.out.println(Fernanda.toString());
                System.out.println(Josue);
                System.out.println(Katy);
                System.out.println(nuevoEmpleado);
                
            ArrayList<Empleado> lista = new ArrayList();
            lista.add(Fernanda);
            lista.add(Josue);
            lista.add(Katy);
            lista.add(nuevoEmpleado);
            
            for(Empleado p: lista) {
                System.out.println(p.toString());
       
                }
    }
    
    
}
