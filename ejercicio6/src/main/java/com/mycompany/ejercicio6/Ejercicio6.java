/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio6;

import com.mycompany.ejercicio6.service.Service;
import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author Damian
 */
public class Ejercicio6 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       Service service = new Service();
       
       
       int salir=0;
        do {
             System.out.println("Menu\n"
                + "1-Cargue un producto\n"
                + "2-Modificar Precio de un producto\n"
                + "3-Eliminar un producto\n"
                + "4-Mostrar todos los productos\n"
                + "5-Salir");
             String opcion = leer.next();
               switch (opcion){
           case "1":
               service.crearProducto();
               break;
           case "2": 
               System.out.println("ingrese el nombre del producto a modificar el precio");
               String nombre= leer.next();
               System.out.println("Ingrese el precio en entero");
               Integer valor = leer.nextInt();
               service.modificarPrecio(nombre,valor);
               break;
           case "3":
               System.out.println("Ingrese el nombre del producto a eliminar");
               service.eliminarProducto(leer.next());
               break;
           case "4":
               service.mostrarTodosLosProductos();
               break;
           case "5":
               salir=5;
               break;
           default:
               System.out.println("ingrese una opcion valida");
               break;
       }
        } while (salir!=5);
  
          
    
               
    }
}
