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
        // Mostrando Menú en pantalla
        String company = String.format("\n%80s\n", "------------------" + Pantalla.COMPANY + "-------------------");
        System.out.print(company);

        String script = String.format("%70s", Pantalla.SCRIPT);
        System.out.println(script);

        System.out.println("                     ----------------------------------------------------------- ");
        String pBienvenida = String.format("\n%60s\n", Pantalla.ENCABEZADO_COBRO);
        
        System.out.println(pBienvenida);
        System.out.println("                     ----------------------------------------------------------- ");
        System.out.println("");
        System.out.println("                                " + Pantalla.BOTON_COBRAR + " " + Pantalla.BOTON_CANCELAR_PEDIDO);
        
        System.out.println("   hello                             " + Pantalla.BOTON_VOLVER_2);
        
        Menu menuCobros = new Menu();
        menuCobros.mostrarBotonesCobro();
        
        System.out.println("                               " + Pantalla.BOTON_VOLVER_2);
        
        

    } 
}
