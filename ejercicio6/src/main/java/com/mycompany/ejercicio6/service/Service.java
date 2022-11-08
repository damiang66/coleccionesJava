
package com.mycompany.ejercicio6.service;

import com.mycompany.ejercicio6.entidades.Productos;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Service {
   private Scanner leer;
   private Productos producto;
   private HashMap<String,Integer> mapa;

    public Service() {
        this.leer= new Scanner(System.in).useDelimiter("\n");
        this.producto= new Productos();
        this.mapa= new HashMap();
    }
   public void crearProducto(){
       System.out.println("-------------------");
       System.out.println("Ingrese nombre del producto");
       producto.setNombre(leer.next());
       System.out.println("Ingrese el precio del producto");
       producto.setPrecio(leer.nextInt());
       mapa.put(producto.getNombre(), producto.getPrecio());
       System.out.println(mapa);
   }
   public void mostrarTodosLosProductos(){
       for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
           String key = entry.getKey();
           Integer value = entry.getValue();
           System.out.println("Nombre: "+key+ " Precio: "+ value);
          
       }
           
       }
   

    public void modificarPrecio(String nombre, Integer valor) {
       int cantidad= mapa.size();
       int contador=0;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (key.equals(nombre)){
                entry.setValue(valor);
                contador++;
            }
        }
       
    }
    public void eliminarProducto(String nombre){
        if(mapa.containsKey(nombre)){
            mapa.remove(nombre);
            
        }else{
            System.out.println("el producto no se encontro");
        }
    }
}
