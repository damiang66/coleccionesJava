package com.mycompany.ejercicio4.service;

import com.mycompany.ejercicio4.entidades.Pelicula;
import com.mycompany.ejercicio4.utilidades.Comparador;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class PeliculaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public List<Pelicula> listaPeliculas = new ArrayList();

    public void crearPelicula() {
        String valor;
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Carga de Peliculas");
            System.out.println("Ingrese un titulo");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicual");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la  pelicula");
            pelicula.setHoras(leer.nextInt());
            listaPeliculas.add(pelicula);
            System.out.println(listaPeliculas);
            System.out.println("desea cargar otra pelicula");
            valor = leer.next();

        } while (valor.equalsIgnoreCase("si"));

    }

    public void mostrarTodasLasPeliculas() {
        for (int i = 0; i < listaPeliculas.size(); i++) {
            System.out.println(listaPeliculas.get(i).toString());
        }

    }

    public void peliculasMayorA1Hora() {
        for (Pelicula aux : listaPeliculas) {
            if (aux.getHoras() > 60) {
                System.out.println(aux.toString());
            }
        }

    }

    public void ordenarPeliculaPorDuracionMenor() {
        Collections.sort(listaPeliculas, Comparador.ordenarPorDuracion);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }

    }

    public void ordenarPeliculaPorDuracionMayor() {
        Collections.sort(listaPeliculas, Comparador.ordenarPorDuracionMayor);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }

    }
public void ordenarPorTitulo(){
    Collections.sort(listaPeliculas, Comparador.ordenarPorTitulo);
    System.out.println(listaPeliculas);
}
public void ordenarPorDirector(){
     Collections.sort(listaPeliculas, Comparador.ordenarPorDirector);
    System.out.println(listaPeliculas);
}
}
