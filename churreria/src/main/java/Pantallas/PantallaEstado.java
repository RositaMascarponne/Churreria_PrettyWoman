/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import logica.*;
import entidades.*;

/**
 *
 * @author Rosita
 */
public class PantallaEstado {

    public void mostrar() {

        String pBienvenida = String.format("-----PANTALLA DE ESTADO-----");

        System.out.println(pBienvenida);
        System.out.println("                     ----------------------------------------------------------- ");
        System.out.println("");
        System.out.println("            3.VOLVER AL MENÚ PRINCIPAL");
       Menu menuEstados=new Menu();
       menuEstados.mostrarSalirAlMenuPrincipal();
        

    }
}
