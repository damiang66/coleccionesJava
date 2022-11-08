/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

import com.mycompany.ejercicio3.entidades.Alumno;
import com.mycompany.ejercicio3.service.AlumnoService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        List<Alumno> listaAlumno = new ArrayList();
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoService servicio = new AlumnoService();
        String opcion;
        do{
        Alumno alumno = servicio.crearAlumno();
        listaAlumno.add(alumno);
        System.out.println("Desea cargar otro alumno");
        opcion=leer.next();
        
        }while(opcion.equalsIgnoreCase("si"));
        for (int i = 0; i < listaAlumno.size(); i++) {
            System.out.println(listaAlumno.get(i).toString());
        }
        System.out.println("---------------");
        System.out.println("ingrese el nombre del alumno a calcular la nota final");
        String buscar=leer.next();
        double notaFinal=0;
        for (int i = 0; i < listaAlumno.size(); i++) {
            if (buscar.equals(listaAlumno.get(i).getNombre())){
                notaFinal=servicio.notaFinal(buscar, listaAlumno); 
           
        }
        }
        System.out.println("la nota final es "+ notaFinal);      
       
            
     
     
    }
}
