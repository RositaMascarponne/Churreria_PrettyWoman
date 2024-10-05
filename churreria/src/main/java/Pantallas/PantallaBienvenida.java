/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import logica.Pantalla;
import entidades.*;
import java.util.Scanner;

/**
 *
 * @author Rosita
 */
public class PantallaBienvenida {
        public void mostrar() {
        // Mostrando Menú en pantalla
        String company = String.format("\n%80s\n", "------------------" + Pantalla.COMPANY + "-------------------");
        System.out.print(company);

        String script = String.format("%70s", Pantalla.SCRIPT);
        System.out.println(script);

        System.out.println("                     ----------------------------------------------------------- ");
        String pBienvenida = String.format("\n%60s\n", Pantalla.ENCABEZADO_BIENVENIDA);
        
        System.out.println(pBienvenida);
        System.out.println("                     ----------------------------------------------------------- ");
        System.out.println("");

        // Mostrando opciones del Menú
        String[] menu = Pantalla.getMenuBienvenida();
        String menuFormateado;

        for (int i = 0; i < menu.length; i++) {
            menuFormateado = String.format("%30s", menu[i]);
            switch (i) {
                case 2 -> {
                    System.out.println(menuFormateado);
                    System.out.println("           --------------------------------------------------------------------------------\n ");
                }
                case 3 -> {
                    menuFormateado = String.format("%53s", menu[i]);
                    System.out.print(menuFormateado);
                }
                default -> System.out.print(menuFormateado);
            }
        }
        System.out.println("");

        // Leer la opción del usuario
    
    }


}
