
package com.mycompany.extra2.service;

import com.mycompany.extra2.entidad.Cantante;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CantanteService {
  private  Scanner leer ;
 
 List<Cantante> lista = new ArrayList();

    public CantanteService() {
        this.leer=new Scanner(System.in).useDelimiter("\n");
        
    }
public List<Cantante> crear(){
    
    Cantante cantante = new Cantante();
        
    System.out.println("Ingrese nombre del cantante");
    cantante.setNombre(leer.next());
    System.out.println("Ingrese el disco mas vendido");
    cantante.setDisco(leer.next());
  lista.add(cantante);
    return lista;
}  

  
    
}
