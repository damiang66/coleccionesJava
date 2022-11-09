
package com.mycompany.extra2.entidad;


public class Cantante {
  private String nombre;
  private String disco;

    public Cantante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Cantante{" + "nombre=" + nombre + ", disco=" + disco + '}';
    }
    
  
  
}
