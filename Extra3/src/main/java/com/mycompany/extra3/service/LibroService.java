/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra3.service;

import com.mycompany.extra3.entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class LibroService {
    private Scanner leer;
    public HashSet<Libro> lista;
    
    public LibroService() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.lista= new HashSet();
      
    }
    public Libro crear(){
        Libro libro= new Libro();
        System.out.println("Ingrese el titulo del libro");
        libro.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        libro.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de ejemplares del libro");
        libro.setEjemplares(leer.nextInt());
     
        lista.add(libro);
     return libro; 
        
    }
    public Libro prestamo(Libro l){
        l.setPrestados(l.getPrestados()+1);
        return l;
    }
}
