/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Rosita
 */
public class ResumenPedido {
 // Atributo para almacenar el resumen
    public String resumen;

    // Constructor que genera el resumen
    public ResumenPedido() {
        // Datos de ejemplo, los puedes reemplazar según tu lógica
        String producto1 = "Churros(4 uds.)";
        //String producto2 = "Suizo";
        int cantidad1 = 2;
        ///int cantidad2 = 1;
        double precioUnitario1 = 5.90;
        //double precioUnitario2 = 2.40;

        // Calcular precios totales
        double precioTotal1 = cantidad1 * precioUnitario1;
       // double precioTotal2 = cantidad2 * precioUnitario2;
       double totalAPagar = precioTotal1;

        // Generar el resumen y almacenarlo en el atributo
        this.resumen = String.format(
            "Resumen:\n" +
            "----------------------------------------------------------------------------------------------------------\n" +
            "  | %-30s | %-8s | %-14s| %-13s\n" +
            
            "  | %-30s | %-8d | %-14.2f€ | %-13.2f€\n" +
            "----------------------------------------------------------------------------------------------------------\n" +
            "                                                Total a pagar:\n" +
            "                                                  %.2f€\n",
            "Producto", "Cantidad", "Precio Unitario", "Precio Total",
            producto1, cantidad1, precioUnitario1, precioTotal1,
            
            totalAPagar
        );
    }
}
