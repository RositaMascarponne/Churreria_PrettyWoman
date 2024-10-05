/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.churreria;

import entidades.*;
import logica.*;
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
            PantallaPedido pantallaPedido = new PantallaPedido();
            pantallaPedido.mostrar();

            //CIERRE CONEXIÓN A BASE DE DATOS        
            conn.close();
            System.out.println("Conexión cerrada");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Se ha producido un error en la conexión.");
        }
    }
}