/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.churreria;



/**
 *
 * @author luisa
 */
public class Churreria {

    public static void main(String[] args) {
<<<<<<< HEAD

=======
        //CONEXIÓN A LA BASE DE DATOS
        try {
           
            String URL = "jdbc:mysql://localhost:3306/churreria_pretty_woman";
            Connection conn = DriverManager.getConnection(URL, "root", "root");

            // Mostrando Menú en pantalla
            //Mostrando Menú en pantalla
            PantallaBienvenida pantallaBienvenida = new PantallaBienvenida();
            pantallaBienvenida.mostrar();

           Menu menuPrincipal = new Menu();
            menuPrincipal.mostrarMenuPrincipal();

            //Traer info de la base de dato
            Churro miChurro = new Churro();
            float precio = miChurro.getPrecioUnitario();
            System.out.println(precio);

            //CIERRE CONEXIÓN A BASE DE DATOS        
            conn.close();
            System.out.println("Conexión cerrada");

        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("Se ha producido un error en la conexión. Puede que no estes en el puerto correcto eh? ¿Pero lo has cambiado?¿Seguro eh? ");
        }
>>>>>>> fa1adc5fc69c53d787e38e96409d7283fd56635e
    }
}
