/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import entidades.*;
import Pantallas.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rosita
 */
public class Menu {

    private Connection conn;
    private Churro churro;

    public void elegirOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                // Lógica para Pantalla 1
                PantallaPedido pantalla1 = new PantallaPedido(); // Crear una instancia de Pantalla1
                pantalla1.mostrar(); // Llamar al método mostrar de Pantalla1
            }
            case 2 -> {
                // Lógica para Pantalla 2
                PantallaEstado pantalla2 = new PantallaEstado(); // Crear una instancia de Pantalla2
                pantalla2.mostrar(); // Llamar al método mostrar de Pantalla2
            }
            case 3 -> {
                // Lógica para Pantalla 3
                PantallaEntrega pantalla3 = new PantallaEntrega(); // Crear una instancia de Pantalla3
                pantalla3.mostrar(); // Llamar al método mostrar de Pantalla3
            }
            case 4 ->
                System.exit(0); // Opción para salir de la aplicación
            default -> {
                System.out.println("Opción no válida. Intenta de nuevo."); // Manejo de opción no válida
                elegirOpcion(); // Volver a elegir opción
            }
        }

    }
}
