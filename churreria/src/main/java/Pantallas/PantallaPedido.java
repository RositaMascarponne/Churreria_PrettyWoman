/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import logica.*;
import entidades.*;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.SQLException;

/**
 *
 * @author Rosita
 */
public class PantallaPedido {

    private Connection conn;

    // Constructor que recibe la conexión
    public PantallaPedido(Connection conn) {
        this.conn = conn;
    }

    public PantallaPedido() {
        this.conn = null;
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    public void mostrar() {
        if (conn == null) {
            System.out.println("Error: No se ha establecido la conexión a la base de datos. Que lo tienes mal, vamos");
            return;
        }

        String pBienvenida = String.format("-----INGRESO DE PEDIDO-----");
        try {
            // Crear instancia de Churro y cargar datos desde la base de datos
            Churro churrosClasicos = new Churro();
            churrosClasicos.cargarDesdeBaseDeDatos(conn, 1); // ID 1 para churros clásicos

            // Mostrar la información del churro directamente, sin formato
            System.out.println("Producto: " + churrosClasicos.getChurroNombre());
            System.out.println("Cantidad: " + churrosClasicos.getChurroCantidad());
            System.out.println("Precio Unitario: " + churrosClasicos.getPrecioUnitario() + "€");
            System.out.println("Precio Total: " + churrosClasicos.getPrecioTotal() + "€");

        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de errores SQL
        }

        System.out.println(pBienvenida);

        ResumenPedido resumenSample = new ResumenPedido();
        System.out.println(resumenSample.resumen);
        System.out.println("");
        System.out.println("                                1.CONFIRMAR      2.VOLVER");

        Menu menuPedidos = new Menu();
        menuPedidos.mostrarBotonesPedido();

    }
}
