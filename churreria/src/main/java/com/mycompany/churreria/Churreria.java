/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.churreria;

import java.util.Scanner;
import dbConexion.*;
import java.sql.Connection;
import java.sql.SQLException;
import entidades.*;

import ui.*;

/**
 *
 * @author luisa
 */
public class Churreria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection miConn = DbConnection.getConnection();

        // Bucle para mostrar el menú principal
        boolean continuar = true;
        while (continuar) {
            // Mostrando Menú de Bienvenida
            String company = String.format("\n%80s\n", "------------------" + mainMenu.COMPANY + "-------------------");
            System.out.print(company);
            String script = String.format("%70s", mainMenu.SCRIPT);
            System.out.println(script);
            System.out.println("                     ----------------------------------------------------------- ");
            String pBienvenida = String.format("\n%60s\n", mainMenu.ENCABEZADO_BIENVENIDA);
            System.out.println(pBienvenida);
            System.out.println("---------------------------------------------------------------------------------");

            // Mostrando las opciones del menuBienvenida
            String[] menu = mainMenu.getMenuBienvenida();
            System.out.printf("%10s", menu[0] + "\t" + menu[1] + "\t" + menu[2] + "\n\n\t\t\t\t" + menu[3]);
            System.out.println("");

            System.out.println("Elija opción----------");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Pantalla de Bienvenida
                    String tipoChurro = "Churros rellenos de crema de avellanas(4uds)";
                    System.out.println("-----------------------------------------------------------------------------------------");
                    String tipoChurros = "1. Churro Clásico\n";
                    System.out.println(tipoChurros);
                    System.out.print("Introducir unidades porfavor: ");

                    // Introducir unidades
                    int unidades = sc.nextInt();

                    // Buscar precio en DB de churro de avellana
                    Churro miChuro = DbChurro.getChurro("Churros rellenos de crema de avellanas");
                    float precioUnitario = miChuro.getChurroPrecio();
                    float precioTotal = unidades * precioUnitario;
                    String aPagar = "Total a pagar: ";
                    float totalPagar = 0;
                    totalPagar += precioTotal;

                    // Llamando al método getResumenPedido
                    String PalabraResumen = String.format("%10s", mainMenu.RESUMEN);
                    System.out.println("\n" + PalabraResumen);
                    System.out.println("--------------------------------------------------------------------------------------------");
                    String[] mResumen = mainMenu.getResumenPedido();
                    System.out.printf("\n| %8s \t\t\t\t\t| %5s | %15s | %10s |\n", mResumen[0], mResumen[1], mResumen[2], mResumen[3]);
                    System.out.printf("%46s%8s%15.2f €%18.2f €\n", tipoChurro, unidades, precioUnitario, precioTotal);

                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.printf("%60s\n%54.2f €", aPagar, totalPagar);

                    // Bucle para manejar la lógica de los botones
                    boolean continuarBoton = true;
                    while (continuarBoton) {
                        System.out.println("\n");
                        System.out.printf("\t\t\t\t| %5s | | %10s | \n", mainMenu.CONFIRMAR, mainMenu.VOLVER);
                        System.out.print("Elija opción: ");
                        // La lógica de los botones
                        int boton = sc.nextInt();
                        switch (boton) {
                            case 1 -> {
                                // Acción para confirmar
                                System.out.println("Pedido confirmado.");
                                continuarBoton = false; // Sale del bucle este
                                continuar = false;// Sin esto se me vuelve al menu principal de nuevo
                                mainMenu menuEstado = new mainMenu();
                                menuEstado.pantallaEstado(); // Si quieres ir a otra pantalla después de confirmar
                                System.out.println("Cierre provisional hasta configurar los botones");
                            }
                            case 2 -> {
                                // Acción para volver al menú principal
                                System.out.println("Volviendo al menú principal...");
                                continuarBoton = false; // Sale del bucle de botones
                                // Aquí no se cierra el programa, simplemente se vuelve al menú principal
                            }
                            default -> {
                                System.out.println("Opción no válida, por favor elija nuevamente.");
                            }
                        }
                    }
                }
                case 2 -> {
                    // Muestra la pantalla de estado

                    mainMenu menuEstado = new mainMenu();
                    menuEstado.pantallaEstado();
                    System.out.println("Cierre provisional hasta configurar los botones");
                    continuar = false; // Finaliza el bucle principal
                }

                case 4 -> {
                    // Cierra el programa
                    System.out.println("Saliendo de la churreria......");
                    continuar = false; // Finaliza el bucle principal, terminando el programa
                }
                default -> {
                    System.out.println("Opción no válida, por favor elija nuevamente.");
                }
            }
        }

        // Cerrar conexión
        try {
            miConn.close();
            System.out.println("Connection close");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("no Connection close");
        }

        sc.close(); // Cerrar el escáner
    }
}
