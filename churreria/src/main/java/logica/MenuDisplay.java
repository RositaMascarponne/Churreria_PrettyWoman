/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;


/**
 *
 * @author Rosita
 */
public class MenuDisplay {
        // Usamos los metodos creados por Luisa en la clase pantalla
        // Método para mostrar el menú de tipos de churros
    public static void mostrarTipoChurro() {
        System.out.println("- Tipo churro:");
        for (String tipo : Pantalla.getTipoChurro()) { 
            System.out.println("\t" + tipo);
        }
        System.out.println(); // Salto de línea al final
    }

    // Método para mostrar el menú de sabores
    public static void mostrarSabores() {
        System.out.println("- Sabores:");
        for (String sabor : Pantalla.getSabor()) {
            System.out.println("\t" + sabor);
        }
        System.out.println(); // Salto de línea al final
    }

    // Método para mostrar el menú de bebidas
    public static void mostrarBebidas() {
        System.out.println("- Bebidas:");
        for (String bebida : Pantalla.getBebida()) { 
            System.out.println("\t" + bebida);
        }
        System.out.println(); // Salto de línea al final
    }
}
