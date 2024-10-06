/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.churreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luisa
 */
public class Churreria {

    public static void main(String[] args) {
        //CONEXIÓN A LA BASE DE DATOS
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/churreria_pretty_woman";
            Connection conn = DriverManager.getConnection(URL, "root", "root");


            //CIERRE CONEXIÓN A BASE DE DATOS        
            conn.close();
            System.out.println("Conexión cerrada");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Se ha producido un error en la conexión.");
        }
    }
}
