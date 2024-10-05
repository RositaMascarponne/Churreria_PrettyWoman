/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.churreria;

import entidades.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luisa
 */
public class Churreria {

    public static void main(String[] args) {
        //CONEXIÓN A LA BASE DE DATOS
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3308/churreria_pretty_woman";
            Connection conn = DriverManager.getConnection(URL, "root", "root");

            //Mostrando Menú en pantalla
            String company = String.format("\n%80s\n", "------------------" + Pantalla.COMPANY + "-------------------");
            System.out.print(company);

            String script = String.format("%70s", Pantalla.SCRIPT);
            System.out.println(script);

            System.out.println("                     ----------------------------------------------------------- ");
            String pBienvenida = String.format("\n%60s\n", Pantalla.ENCABEZADO_BIENVENIDA);
            System.out.println(pBienvenida);
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

            //CIERRE CONEXIÓN A BASE DE DATOS        
            conn.close();
            System.out.println("Conexión cerrada");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Se ha producido un error en la conexión.");
        }
    }
}