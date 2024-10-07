/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pantallas;

import logica.Menu;
import logica.Pantalla;

/**
 *
 * @author Rosita
 */
public class PantallaCobro {
    
    
    
       public void mostrar() {


        
        String pBienvenida = String.format("-----PANTALLA DE COBRO-----");
        
        System.out.println(pBienvenida);
        
        System.out.println("");
        System.out.println("1.COBRAR            2.CANCELAR PEDIDO");
        
        
        
        Menu menuCobros = new Menu();
        System.out.println("3.VOLVER AL MENU PRINCIPAL");
        menuCobros.mostrarBotonesCobro();
        
        System.out.println("3.VOLVER AL MENU PRINCIPAL");
        menuCobros.mostrarSalirAlMenuPrincipal();
        
        
        

    } 
}
