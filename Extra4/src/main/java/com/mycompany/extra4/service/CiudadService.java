
package com.mycompany.extra4.service;

import com.mycompany.extra4.entidades.Ciudad;
import java.util.Scanner;


public class CiudadService {
  private Scanner leer; 

    public CiudadService() {
  this.leer= new Scanner(System.in).useDelimiter("\n");
    }
  public Ciudad crear(){
      Ciudad ciudad= new Ciudad();
      System.out.println("Ingrese codigo postal");
      ciudad.setCodigoPostal(leer.next());
      System.out.println("Ingrese nombre de la cuidad ");
      ciudad.setNombre(leer.next());
      return ciudad;
  }
}
