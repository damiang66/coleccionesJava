/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Extra1 {

    public static void main(String[] args) {
        List<Integer>lista = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int numero=0;
        do {
            System.out.println("ingrese un numero");
             numero =leer.nextInt();
             if (numero==99){
                 break;
             }
            lista.add(numero);
        } while (numero!=99);
        System.out.println("los numeros ingresados son: " + lista);
        System.out.println("la cantidad de numeros ingresados son: "+ lista.size());
        int suma=0;
        for (int i = 0; i < lista.size(); i++) {
            suma+=lista.get(i);
        }
        System.out.println("la suma de todos los numeros ingresados es "+ suma);
        System.out.println("el promedio de los numeros ingresado es " + suma/3);
    }
}
