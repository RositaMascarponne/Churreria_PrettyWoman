/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import logica.*;
import entidades.*;

import java.util.Scanner;

/**
 *
 * @author Rosita
 */
public class PantallaPedido {

    public void mostrar() {
        // Mostrando Menú en pantalla
        String company = String.format("\n%80s\n", "------------------" + Pantalla.COMPANY + "-------------------");
        System.out.print(company);

        String script = String.format("%70s", Pantalla.SCRIPT);
        System.out.println(script);

        System.out.println("                     ----------------------------------------------------------- ");
        String pBienvenida = String.format("\n%60s\n", Pantalla.ENCABEZADO_PEDIDO);

        System.out.println(pBienvenida);
        System.out.println("                     ----------------------------------------------------------- ");
        System.out.println("");
        System.out.println("                                " + Pantalla.BOTON_CONFIRMAR + " " + Pantalla.BOTON_VOLVER);

        Menu menuPedidos = new Menu();
        menuPedidos.mostrarBotonesPedido();

    }
}
