/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.churreria;

import java.util.Scanner;
import dbConexion.*;
import java.sql.Connection;
import java.sql.SQLException;
import entidades.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
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

        //mostrando las opciones del menuBienvenida
        String[] menu = mainMenu.getMenuBienvenida();
        System.out.printf("%10s", menu[0] + "\t" + menu[1] + "\t" + menu[2] + "\n\n\t\t\t\t" + menu[3]);
        System.out.println("");

        System.out.println("Elija opción----------");
        int opcion = sc.nextInt();
        int unidades;
        String[] mResumen = mainMenu.getResumenPedido();//llamando al metodo getResumen 
        String tipoChurro = "Churros rellenos de crema de avellanas(4uds)";

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

                //Introducir unidades
                unidades = sc.nextInt();

                //Buscar precio en DB de churro de avellana
                Churro miChuro = DbChurro.getChurro("Churros rellenos de crema de avellanas");
                //Usado BigDecimal para no perder precision y sacar el numero de decimales deseado
                float precioUnitario = miChuro.getChurroPrecio();
                BigDecimal precioUnitarioBD = new BigDecimal(Float.toString(precioUnitario));
                precioUnitarioBD = precioUnitarioBD.setScale(2, RoundingMode.HALF_UP);
                float precioTotal = unidades * precioUnitario;
                String aPagar = "Total a pagar: ";
                float totalPagar = 0;
                totalPagar += precioTotal;

                //Lammando al metodo getResumenPedido
                String PalabraResumen = String.format("%10s", mainMenu.RESUMEN);
                System.out.println("\n" + PalabraResumen);
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.printf("\n| %8s \t\t\t\t\t| %5s | %15s | %10s |\n", mResumen[0], mResumen[1], mResumen[2], mResumen[3]);

                System.out.printf("%46s%8s%15s%18.2f\n", tipoChurro, unidades, precioUnitarioBD, precioTotal);
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("");
                System.out.printf("%60s\n%54.2f", aPagar, totalPagar);

                System.out.println("\n");
                System.out.printf("\t\t\t\t| %5s | | %10s | \n", mainMenu.CONFIRMAR, mainMenu.VOLVER);

            }
            case 2 -> {
               mainMenu menuEstado = new mainMenu(); 
               menuEstado.pantallaEstado();

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
