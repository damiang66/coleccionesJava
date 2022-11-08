/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author Damian
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      TreeSet<String> paises = new  TreeSet();
      String opcion;
        do {
           System.out.println("ingrese un pais");
        paises.add(leer.next()); 
            System.out.println("desea cargar otro pais");
            opcion=leer.next();
        } while (opcion.equalsIgnoreCase("Si"));
        List<String> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises);
        TreeSet<String> paisOrdenado = new TreeSet(listaPaises);
        for (String aux : paisOrdenado) {
            System.out.println(aux);
        }
        System.out.println("ingrese un pais a buscar");
        String buscar=leer.next();
        int cantidad=paisOrdenado.size();
        for (Iterator<String> iterator = paisOrdenado.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            if(next.equalsIgnoreCase(buscar)){
                iterator.remove();
            }
            
        }
        if (cantidad==paisOrdenado.size()){
            System.out.println("el pais no fue encontrado");
        }else{
            System.out.println("el pais eliminado es "+ buscar);
        }
        for (String string : paisOrdenado) {
            System.out.println(string);
        }
        
    }
}
