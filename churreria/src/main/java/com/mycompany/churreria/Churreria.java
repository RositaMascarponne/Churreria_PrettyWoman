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
        /*
        //Consultando un churro por nombre
        Churro miChuro = DbChurro.getChurro("Churros rellenos de crema de avellanas");
        System.out.println(miChuro.getChurroPrecio());
         */
        //Mostrando Menú de Bienvenida
        String company = String.format("\n%80s\n", "------------------" + mainMenu.COMPANY + "-------------------");
        System.out.print(company);
        String script = String.format("%70s", mainMenu.SCRIPT);
        System.out.println(script);
        System.out.println("                     ----------------------------------------------------------- ");
        String pBienvenida = String.format("\n%60s\n", mainMenu.ENCABEZADO_BIENVENIDA);
        System.out.println(pBienvenida);
        System.out.println("---------------------------------------------------------------------------------");

        //mostrando las opciones del menu
        String[] menu = mainMenu.getMenuBienvenida();
        System.out.printf("%10s", menu[0] + "\t" + menu[1] + "\t" + menu[2] + "\n\n\t\t\t\t" + menu[3]);
        System.out.println("");

        System.out.println("Elija opción----------");
        int opcion = sc.nextInt();
        int unidades;
        String[] mResumen = mainMenu.getResumenPedido();
        String tipoChurro = "Churros rellenos de crema de avellanas(4uds)";
        unidades = 1 ;
        float precioUnitario = 5.90f;
        float precioTotal = unidades + precioUnitario;
        String totalPagar = " Total a Pagar: ";

        switch (opcion) {
            case 1 -> {
                // Pantalla de Bienvenida
                company = String.format("\n%80s\n", "------------------" + mainMenu.COMPANY + "-------------------");
                System.out.print(company);
                script = String.format("%70s", mainMenu.SCRIPT);
                System.out.println(script);
                System.out.println("                     ----------------------------------------------------------- ");
                pBienvenida = String.format("\n%60s\n", mainMenu.INGRESAR_PEDIDO);
                System.out.println(pBienvenida);
                System.out.println("-----------------------------------------------------------------------------------------");

                String tipoChurros = "1. Churro Clásico\n";
                System.out.println(tipoChurros);
                System.out.print("Introducir unidades porfavor: ");
                unidades = sc.nextInt();

                //Lammando al metodo getResumenPedido
                String PalabraResumen = String.format("%10s", mainMenu.RESUMEN);
                System.out.println("\n" + PalabraResumen);
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.printf("\n| %8s \t\t\t\t\t| %5s | %15s | %10s |\n", mResumen[0], mResumen[1], mResumen[2], mResumen[3]);
                System.out.printf("%46s%8s%15s%18s\n", tipoChurro, unidades, precioUnitario, precioTotal);
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.printf("%60s", totalPagar + "\n\t\t\t\t   11.80€");
                System.out.println("\n");

            }

        }

        try {
            miConn.close();
            System.out.println("Connection close");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("no Connection close");
        }

    }
}
