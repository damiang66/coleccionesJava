package com.mycompany.extra2;

import com.mycompany.extra2.entidad.Cantante;
import com.mycompany.extra2.service.CantanteService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Cantante> lista = new ArrayList();
        CantanteService servicio = new CantanteService();
      
        for (int i = 0; i < 5; i++) {
            lista=servicio.crear();
            
          
         
           
        }
        String opcion;
          int salir=0;
        do {
            System.out.println("Menu\n"
                    + "1- Ingrese un Cantante\n"
                    + "2- Mostar todos los cantantes\n"
                    + "3- Eliminar un cantante\n"
                    + "4- Salir");
            opcion = leer.next();
          
            switch (opcion) {
                case "1":
                    lista=servicio.crear();
                   
                    break;
                    case "2":
                    
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(lista.get(i));
                        }
                    break;
                    case "3":
                        System.out.println("Ingrese un cantante a eliminar");
                         String eliminar=leer.next();
                        for (int i = 0; i < lista.size(); i++) {
                            
                           
                           if( lista.get(i).getNombre().equals(eliminar)){
                               lista.remove(i);
                               System.out.println("cantante eliminado");
                           }
                            
                        }
                        break;
                    case "4":
                        salir=4;
            }
          
        } while (salir!=4);
     
        /*
        
       
        Iterator<Cantante> it= lista.iterator();
              
        while (it.hasNext()) {
           // System.out.println("hola");
           if(it.next().getNombre().equals("a")){
               it.remove();
               
           }
       
        }
        
        
         Iterator<Cantante> ita= lista.iterator();
        while (ita.hasNext()) {
            System.out.println(ita.next());
            
        }
 */
    }

}
