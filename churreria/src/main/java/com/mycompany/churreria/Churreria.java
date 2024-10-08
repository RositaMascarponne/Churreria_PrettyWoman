/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.churreria;

import dbConexion.*;
import java.sql.Connection;
import java.sql.SQLException;
import entidades.*;

/**
 *
 * @author luisa
 */
public class Churreria {

    public static void main(String[] args) {

        Connection miConn = DbConnection.getConnection();
     
        
        Churro miChuro = DbChurro.getChurro("Churros rellenos de crema de avellanas");
        System.out.println(miChuro.getChurroPrecio());
        
        
        
        
        
        
        
        try {
            miConn.close();
            System.out.println("Connection close");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("no Connection close");
        }

    }
}
