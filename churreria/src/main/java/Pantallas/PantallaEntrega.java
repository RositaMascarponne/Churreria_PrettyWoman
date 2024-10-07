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
public class PantallaEntrega {
        public void mostrar() {


 
        String pBienvenida = String.format("-----PANRALLA DE ENTREGA-----");
        
        System.out.println(pBienvenida);
        System.out.println("                     ----------------------------------------------------------- ");
        System.out.println("");
        System.out.println("            3.VOLVER AL MENÚ PRINCIPAL");
       Menu menuEntrega=new Menu();
       menuEntrega.mostrarSalirAlMenuPrincipal();
        

    } 
}
