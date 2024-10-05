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

    public void mostrarMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n\n ------------------ Elige una opcion:");
            try {
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        // A 1.Pedidos
                        PantallaPedido pantalla1 = new PantallaPedido();
                        pantalla1.mostrar();
                        break;
                    case 2:
                        // A 2.Estados
                        PantallaEstado pantalla2 = new PantallaEstado();
                        pantalla2.mostrar();
                        break;
                    case 3:
                        //  A 3.Entrega
                        PantallaEntrega pantalla3 = new PantallaEntrega();
                        pantalla3.mostrar();
                        break;
                    case 4:
                        System.out.println("Saliendo de la churreria...");

                        break;
                    default:
                        System.out.println("A ver, que esto solo tiene 4 opciones. No me lies, por dios."); // Manejo de opción no válida
                        mostrarMenuPrincipal(); // Volver a elegir opción

                }

            } /*catch(SQLException e){
                e.printStackTrace();
                System.out.println("Jopelines, la base de datos parece estar cascadilla");
            }*/ catch (InputMismatchException e) {
                System.out.println("Pues como que algo no has escrito bien eh? nah, pero tu vuelve a probar, tranqui");
            }
        }
    }

}
