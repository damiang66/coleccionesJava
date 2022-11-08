/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4.utilidades;

import com.mycompany.ejercicio4.entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Damian
 */
public class Comparador {
    public static Comparator<Pelicula>ordenarPorDuracion=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                return t.getHoras().compareTo(t1.getHoras());
        }
    };
     public static Comparator<Pelicula>ordenarPorDuracionMayor=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                return t1.getHoras().compareTo(t.getHoras());
        }
    };
      public static Comparator<Pelicula>ordenarPorTitulo=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
       public static Comparator<Pelicula>ordenarPorDirector=new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
}
