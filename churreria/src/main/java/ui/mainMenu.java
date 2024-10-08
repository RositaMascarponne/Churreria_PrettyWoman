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


    public static String[] getMenuBienvenida() {
        String[] menu = {"1. Ingresar Pedido", "2. Estado de Pedidos", "3. Entregar Pedidos", "4. Salir"};
        return menu;
    }
        public static String[] getResumenPedido() {
        String[] resumen = {"Producto", "Cantidad", "Precio Unitario", "Precio total"};
        return resumen;
    }
    
}
