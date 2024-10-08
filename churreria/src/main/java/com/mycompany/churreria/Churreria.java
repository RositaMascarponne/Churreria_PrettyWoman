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

        switch (opcion) {
            case 1 -> {
                //pantallaPedido
                /*String[] pantallaIngreso = mainMenu.getMenuBienvenida();
                for(String ListaMenu : pantallaIngreso){
                    System.out.println(ListaMenu); 
                    
                }*/
                System.out.print("CUANTAS UNIDADES DE CHURROS: ");
                unidades = sc.nextInt();
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
