/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.extra3;

import com.mycompany.extra3.entidad.Libro;
import com.mycompany.extra3.service.LibroService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> lista = new HashSet();
        LibroService service = new LibroService();
        String opcion;
        do {
            Libro libro = service.crear();
            lista.add(libro);
            System.out.println("desea cargar otro libro");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("Si"));
        for (Libro libro : lista) {
            System.out.println(libro);
        }
        String auxiliar;
        
        do {
            System.out.println("Ingrese un libro a prestar");
            String libroAPrestar = leer.next();

            Iterator<Libro> it = lista.iterator();
            while (it.hasNext()) {
                Libro next = it.next();
                int cantidad=next.getEjemplares();
                if (next.getAutor().equals(libroAPrestar)) {
                    System.out.println(cantidad);
                    System.out.println(next.getPrestados());
                      if(cantidad!=next.getPrestados()){
                        next = service.prestamo(next);
                        lista.add(next);
                    } else {
                        System.out.println("no tiene mas libro para prestar");
                    }

                }
            }
            for (Libro libro : lista) {
                System.out.println(libro);
            }
            System.out.println("desea seguir prestando libros");
            auxiliar = leer.next();

        } while (auxiliar.equalsIgnoreCase("si"));
    }
}
