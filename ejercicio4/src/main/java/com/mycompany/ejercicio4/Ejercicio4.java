

package com.mycompany.ejercicio4;

import com.mycompany.ejercicio4.service.PeliculaService;

public class Ejercicio4 {
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
    public static void main(String[] args) {
        PeliculaService servicio = new PeliculaService();
        servicio.crearPelicula();
        System.out.println("Todas las peliculas cargadas");
        servicio.mostrarTodasLasPeliculas();
        System.out.println("peliculas mayores a una hora");
        servicio.peliculasMayorA1Hora();
        System.out.println("peliculas ordenadas por duracion de menor a mayor");
        servicio.ordenarPeliculaPorDuracionMenor();
        System.out.println("peliculas ordenadas por duracion de mayor a menor");
        servicio.ordenarPeliculaPorDuracionMayor();
        System.out.println("Ordenadas por titulo");
        servicio.ordenarPorTitulo();
        System.out.println("Ordenadas por Director");
        servicio.ordenarPorDirector();
    }
}
