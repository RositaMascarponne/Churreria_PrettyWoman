package ui;

/**
 *
 * @author luisa
 */
public class mainMenu {
    //Atributos de la clase mainMenu

    public static final String COMPANY = "CHURRERÍA PRETTY WOMAN";
    public static final String SCRIPT = "Dulce tentación, perfecto en cada ocasión";
    public static final String ENCABEZADO_BIENVENIDA = "-PANTALLA DE BIENVENIDA-";
    public static final String INGRESAR_PEDIDO = "INGRESAR PEDIDO";
    public static final String RESUMEN = "RESUMEN: ";
    public static final String COBRO_PERDIDO = "COBRAR DE PEDIDO";
    public static final String ESTADO_PEDIDO = "ESTADO DE PEDIDOS";
    public static final String ENTREGA = "ENTREGAR PEDIDO";
    
    public static final String PRUEBA= "CAEBECERA DE EJEMPLO";//PARA HACER PRUEBAS

    //Atributos para hacer los botones del menú
    public static final String CONFIRMAR = "1.Confirmar";
    public static final String VOLVER = "2.Volver atrás";

    public static String[] getMenuBienvenida() {
        String[] menu = {"1. Ingresar Pedido", "2. Estado de Pedidos", "3. Entregar Pedidos", "4. Salir"};
        return menu;
    }

    public static String[] getResumenPedido() {
        String[] resumen = {"Producto", "Cantidad", "Precio Unitario", "Precio total"};
        return resumen;
    }

    public static String[] getBotonIngreso() {
        String[] botonPIngreso = {"Confirmar", "Volver atrás",};
        return botonPIngreso;
    }

    //PANTALLAS
    
    //PANATALLA DE ESTADO
    public void pantallaEstado() {
        String company2 = String.format("\n%80s\n", "------------------" + COMPANY + "-------------------");
        System.out.print(company2);

        String script2 = String.format("%70s", SCRIPT);
        System.out.println(script2);

        System.out.println("                     ----------------------------------------------------------- ");
        String pBienvenida2 = String.format("\n%60s\n", ESTADO_PEDIDO);

        System.out.println(pBienvenida2);
        System.out.println("                     ----------------------------------------------------------- ");
        System.out.println("");
        System.out.println("\n\n\n\n\nY aqui ira algo muy bonito\n\n\n\n\n\n");
        
        System.out.printf("\t\t\t\t| %5s | | %10s | \n", CONFIRMAR, VOLVER);
        
    }

}
