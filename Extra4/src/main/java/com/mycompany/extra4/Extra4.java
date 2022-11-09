/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.extra4;

import com.mycompany.extra4.entidades.Ciudad;
import com.mycompany.extra4.service.CiudadService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, String> mapa = new HashMap();
        CiudadService service = new CiudadService();
        //cargar por teclado
        /*
        for (int i = 0; i < 10; i++) {
            Ciudad ciudad= service.crear();
            mapa.put(ciudad.getCodigoPostal(),ciudad.getNombre());
        }
         */
        // cargados 
        mapa.put("5501", "Godoy Cruz");
        mapa.put("5500", "Mendoza");
        mapa.put("5515", "Maipu");
        mapa.put("5519", "Dorrego");
        mapa.put("5570", "San Martin");
        mapa.put("5600", "San Rafael");
        mapa.put("5580", "Tupungato");
        mapa.put("5590", "Tunuyan");
        mapa.put("5539", "Las Heras");
        mapa.put("5523", "Villa Nueva");

        //mostrar
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("codigo postal " + key + " ciudad: " + val);
        }
        // mostar por un codigo postal ingresado
        System.out.println("Ingrese un codigo Postal y te muestro su ciudad corresponiente");
        String codigo = leer.next();
        if (mapa.containsKey(codigo)) {
            for (Map.Entry<String, String> entry : mapa.entrySet()) {
                Object key = entry.getKey();
                Object val = entry.getValue();
                if (key.equals(codigo)) {
                    System.out.println("la ciudad asociada a este codigo postal es " + val);
                }
            }
        } else {
            System.out.println("el codigo postal no esta en la lista");
        }
        //agregar una ciudad mas 
        mapa.put("7777", "Otra ciudad");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un codigo postal para eliminar la ciudad");
            String eliminar = leer.next();
            if (mapa.containsKey(eliminar)) {
                mapa.remove(eliminar);
            } else {
                System.out.println("el codigo postal no esta en la lista");
                i--;
            }
        }
        //mostrar
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("codigo postal " + key + " ciudad: " + val);
        }

    }
}
