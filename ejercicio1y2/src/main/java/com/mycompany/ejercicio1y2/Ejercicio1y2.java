/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Ejercicio1y2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       List<String> listaRazas = new ArrayList();
       String opcion;
       do{
           System.out.println("ingrese una raza de perro");
           String raza=leer.next();
           listaRazas.add(raza);
           System.out.println("desea seguir cargando razas");
          opcion= leer.next();
       }while(opcion.equalsIgnoreCase("si"));
        for (String aux : listaRazas) {
            System.out.println("las razas de perros cargadas son "+aux);
        }
        System.out.println("--------------------------");
        System.out.println("Ingrese una raza de perro para ver si se encuentra en la lista");
        String buscar = leer.next();
         int auxiliar=0;
        for (Iterator<String> iterator = listaRazas.iterator(); iterator.hasNext();) {
           String next = iterator.next();
            
            if (next.equals(buscar)){
                iterator.remove();
                auxiliar++;
            }
        }
            if (auxiliar>0){
                System.out.println("El perro se encontro en la lista");
                Collections.sort(listaRazas);
                System.out.println("-----------------");
                System.out.println("raza perro ordenada");
                for (String aux: listaRazas) {
                    System.out.println(aux);
                }
            }else{
                System.out.println("El perro no se encontro en la lista");
                Collections.sort(listaRazas);
                for (String aux : listaRazas) {
                    System.out.println(aux);
                }
            }
            
        }
    }

