/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.churreria;

import java.util.Scanner;
import dbConexion.*;
import java.sql.Connection;
import java.sql.SQLException;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import ui.*;

/**
 *
 * @author luisa
 */
public class Churreria {
    // Lista estática para almacenar los pedidos

    private static List<Pedido> listaPedidos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Connection miConn = DbConnection.getConnection();

        //VARIABLES
        // Buscar precio en DB de churro de avellana
        Churro miChuro = DbChurro.getChurro("Churros clásicos (4ud.)");
        float precioUnitario = miChuro.getChurroPrecio();
        String tipoChurro = miChuro.getChurroNombre();
        int idChurro = miChuro.getChurroId();
        int unidades = 1;

        //Incicando número de pedido
        int numeroPedido = 1;

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
                    System.out.println("-----------------------------------------------------------------------------------------");
                    String tipoChurros = "1. Churro Clásico\n";
                    System.out.println(tipoChurros);
                    System.out.print("Introducir unidades porfavor: ");

                    // Introducir unidades
                    unidades = sc.nextInt();

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

                    System.out.printf("%25s%30s%15.2f €%15.2f €\n", tipoChurro, unidades, precioUnitario, precioTotal);

                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.printf("%60s\n%54.2f €", aPagar, totalPagar);

                    // Bucle para manejar la lógica de los botones
                    boolean continuarBoton = true;
                    while (continuarBoton) {
                        System.out.println("\n");
                        System.out.printf("\t\t\t\t| %5s | | %10s | \n", mainMenu.CONFIRMAR, mainMenu.VOLVER);
                        System.out.print("Elija opción: \n");
                        // La lógica de los botones
                        int boton = sc.nextInt();
                        switch (boton) {
                            case 1 -> {
                                // Acción para confirmar
                                System.out.println("Pedido confirmado.");
                                numeroPedido++;

                                // Asignar la cantidad de churros al pedido
                                //INSERTAR PEDIDO CONFIRMADO EN LA DB
                                Pedido miPedido = new Pedido();
                                miPedido.setPedidoId(numeroPedido);
                                miPedido.setChurroId(idChurro); // imprimiendo churro por ID
                                miPedido.setPedidoCantidad(unidades);
                                miPedido.setEstado_Id(1);

                                DbPedido.insertNewPedido(miPedido);

                                //System.out.printf("\t\t\t\t\n\t\t\t\t| %5s | | %10s | \n", mainMenu.CONFIRMAR, mainMenu.VOLVER);
                                continuarBoton = false; // Sale del bucle este
                                //continuar = false;// Sin esto se me vuelve al menu principal de nuevo // creo que debe terminar cuando de opcion
                                // salir en el menu principla que es la 4 (Luisa)
                            }
                            case 2 -> {
                                // Acción para volver al menú principal
                                System.out.println("Volviendo al menú principal...");
                                continuarBoton = false; // Sale del bucle de botones
                                // Aquí no se cierra el programa, simplemente se vuelve al menú principal
                            }
                            default -> {
                                System.out.println("\nOpción no válida, por favor elija nuevamente.");
                            }
                        }
                    }
                }
                case 2 -> {
                    /*
                    Para mantenernos dentro de la pantalla y salir de ella con un boton:
                    1.Creamos una variable booleana y inicializamos en false. 
                    2.Encapsulamos la "pantalla en un while que se mantendrá mientras la booleana siga en false
                    3.Ponemos el boton en la ubicación deseada, creamos una variable int de scanner y un 
                    simple if que al pulsar 1 ca,bie la booleana a true, y PAM!! Rompa el bucle, 
                    con lo que saldremos de la "pantalla"
                    Hay que hacer kata de esto...menu in menu mediante bucles controlados por variables booleanas
                    */
                    
                    //creando pantalla pedido
                    mainMenu menuEstado = new mainMenu();
                    boolean volverAlMenu = false;//Esta booleana nos sirve para mantenernos en esta pantalla
                    while (!volverAlMenu) { //Bueno, tecnicamente este bucle mantiene esta pantalla
                        menuEstado.pantallaEstado();

                        //Imprimiendo numero de pedido
                        System.out.printf(mainMenu.nPedido + numeroPedido);

                        //Imprimiendo estado 
                        String[] detalleEstado = mainMenu.getDetalleEstado();
                        System.out.printf("\n\n\t| %5s\t\t\t | %5s |\n\t", detalleEstado[0], detalleEstado[1]);
                        System.out.printf("%25s%15s\n\n\t\t\t\t", tipoChurro, unidades);
                        System.out.print(mainMenu.ESTADO);

                        //Llamando array de String listaEstado para imprimir el estado -En preparación                           
                        String[] listaEstado = mainMenu.listaEstado;
                        System.out.println(listaEstado[0]);
                        System.out.println("-------------------------------------------------------------------------------- ");
                        System.out.println("-------------------------------------------------------------------------------- ");
                        //Imprimiendo Estado de pedido -Listo 
                        System.out.printf(mainMenu.nPedido);
                        System.out.printf("\n\n\t| %5s\t\t\t | %5s |\n\t", detalleEstado[0], detalleEstado[1]);
                        System.out.printf("%25s%15s\n\n\t\t\t\t", tipoChurro, unidades);
                        System.out.print(mainMenu.ESTADO);
                        //Llamando array de String listaEstado                                
                        listaEstado = mainMenu.listaEstado;
                        System.out.println(listaEstado[1]);
                        System.out.println("-------------------------------------------------------------------------------- ");
                        System.out.println("-------------------------------------------------------------------------------- ");
                        //Llamando array de Sting ListaEstado para imprimir el estado -Entregado
                        System.out.printf(mainMenu.nPedido);
                        System.out.printf("\n\n\t| %5s\t\t\t | %5s |\n\t", detalleEstado[0], detalleEstado[1]);
                        System.out.printf("%25s%15s\n\n\t\t\t\t", tipoChurro, unidades);
                        System.out.print(mainMenu.ESTADO);
                        //Llamando array de String listaEstado                                
                        listaEstado = mainMenu.listaEstado;
                        System.out.println(listaEstado[2]);
                        System.out.println("--------------------------------------------------------------------------------\n");
                        // Opción para volver al menú principal
                        System.out.printf("%70s\t\t\n", mainMenu.VOLVER_MENU);

                        int opcionVolver = sc.nextInt();

                        if (opcionVolver == 1) {
                            volverAlMenu = true; // Salimos del bucle y volvemos al menú principal
                        }

                    }
                }

                case 3 -> {
                    //Muestra Pantalla Entrega
                    company = String.format("\n%80s\n", "------------------" + mainMenu.COMPANY + "-------------------");
                    System.out.print(company);
                    script = String.format("%70s", mainMenu.SCRIPT);
                    System.out.println(script);
                    System.out.println("                     ----------------------------------------------------------- ");
                    System.out.printf("%60s", mainMenu.ENTREGA);
                    System.out.println("\n--------------------------------------------------------------------------------\n");
                    System.out.printf("%70s\t\t\n", mainMenu.VOLVER_MENU);

                    System.out.printf(mainMenu.nPedido);
                    String[] detalleEstado = mainMenu.getDetalleEstado();
                    System.out.printf("\n\t| %5s\t\t\t | %5s |\n\t", detalleEstado[0], detalleEstado[1]);

                    System.out.printf("%25s%15s\n\n\t\t\t\t", tipoChurro, unidades);

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
