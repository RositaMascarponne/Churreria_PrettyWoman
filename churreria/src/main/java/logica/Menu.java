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
    //private Churro churro;

    //El menu de la PANTALLA DE BIENVENIDA:
    public void mostrarMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

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

    //Los botones CONFIRMAR y VOLVER  de la PANTALLA DE PEDIDOS:
    public void mostrarBotonesPedido() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("\n\n ------------------ Elige una opcion:");
        try {
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    // A 1.Confirmar (a cobro)
                    PantallaCobro pantalla1 = new PantallaCobro();
                    pantalla1.mostrar();

                    break;
                case 2:
                    // A 2.Volver (A pantalla de bienvenida)
                    PantallaBienvenida pantalla2 = new PantallaBienvenida();
                    pantalla2.mostrar();
                    mostrarMenuPrincipal();
                    break;

                default:
                    System.out.println("A ver, que esto solo tiene 2 opciones. No me lies, por dios."); // Manejo de opción no válida
                    mostrarMenuPrincipal(); // Volver a elegir opción

            }

        } /*catch(SQLException e){
                e.printStackTrace();
                System.out.println("Jopelines, la base de datos parece estar cascadilla");
            }*/ catch (InputMismatchException e) {
            System.out.println("Pues como que algo no has escrito bien eh? nah, pero tu vuelve a probar, tranqui");
        }

    }

    //Los botones COBRAR y CANCELAR PEDIDO de la PANTALLA DE COBRO:
    public void mostrarBotonesCobro() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuarEnPantallaCobro = true;
        while (continuarEnPantallaCobro) {
            System.out.println("\n\n ------------------ Elige una opcion:");
            try {
                opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        // A 1.Cobrar (El estado del pedido pasa: En preparacion.¿Se crea en este instante el pedido?)
                        System.out.println("El pago se realizó de maravilla");
                        
                        mostrarSalirAlMenuPrincipal();

                        break;
                    case 2:
                        // A 2.Cancelar Pedido (A pantalla de bienvenida y nada más. No hay pedido. No money, no churros)
                        System.out.println("No pagas, no churros");
                        PantallaBienvenida pantalla2 = new PantallaBienvenida();
                        pantalla2.mostrar();
                        continuarEnPantallaCobro = false;
                        mostrarMenuPrincipal();
                        break;

                    default:
                        System.out.println("A ver, que esto solo tiene 2 opciones. No me lies, por dios."); // Manejo de opción no válida

                        mostrarMenuPrincipal(); // Volver a elegir opción

                }

            } /*catch(SQLException e){
                e.printStackTrace();
                System.out.println("Jopelines, la base de datos parece estar cascadilla");
            }*/ catch (InputMismatchException e) {
                System.out.println("Pues como que algo no has escrito bien eh? nah, pero tu vuelve a probar, tranqui");
                sc.nextLine();
            }
        }

    }
    //El boton VOLVER AL MENÚ PRINCIPAL de la PANTALLA DE COBRO(en switch para darle flexibilidad ante futuras actualizaciones):

    public void mostrarSalirAlMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("\n\n ------------------ Elige una opcion:");
        try {
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 3:
                    // 3.Volver al menú principal
                    PantallaBienvenida pantalla1 = new PantallaBienvenida();
                    pantalla1.mostrar();
                    mostrarMenuPrincipal();

                    break;

                default:
                    System.out.println("A ver, que esto solo tiene 2 opciones. No me lies, por dios."); // Manejo de opción no válida
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
