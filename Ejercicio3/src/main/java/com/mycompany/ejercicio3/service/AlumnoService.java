
package com.mycompany.ejercicio3.service;

import com.mycompany.ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
 private Scanner leer = new Scanner(System.in).useDelimiter("\n");
 //List<Alumno> listaAlumno= new ArrayList();
 public Alumno crearAlumno(){
     List<Integer> notas = new ArrayList();
     Alumno alumno = new Alumno();
     System.out.println("Ingrese el nombre del alumno");
     alumno.setNombre(leer.next());
     for (int i = 0; i < 3; i++) {
         System.out.println("ingrese la nota nro "+i );
        notas.add(leer.nextInt());
     }
     alumno.setNotas(notas);
     //listaAlumno.add(alumno);
     return alumno;
 }

 public double notaFinal(String nombre, List<Alumno> listaAlumno){
   double nota=0;
     for (int i = 0; i < listaAlumno.size(); i++) {
         if (nombre.equalsIgnoreCase(listaAlumno.get(i).getNombre()))
             for (int j = 0; j < listaAlumno.get(i).getNotas().size(); j++) {
                nota+=listaAlumno.get(i).getNotas().get(j);
                
             }
        
     }
    return nota/3;
 }
}
