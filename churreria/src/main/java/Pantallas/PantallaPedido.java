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

        
        String pBienvenida = String.format("-----INGRESO DE PEDIDO-----");

        System.out.println(pBienvenida);
        

        ResumenPedido resumenSample=new ResumenPedido();
        System.out.println(resumenSample.resumen);
        System.out.println("");
        System.out.println("                                1.CONFIRMAR      2.VOLVER");

        Menu menuPedidos = new Menu();
        menuPedidos.mostrarBotonesPedido();

    }
}
