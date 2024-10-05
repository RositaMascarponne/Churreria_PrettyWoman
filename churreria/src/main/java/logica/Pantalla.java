package logica;

/**
 *
 * @author luisa
 */
public abstract class Pantalla {

    //Atributos de la clas Pantalla
    public static final String COMPANY = "CHURRERÍA PRETTY WOMAN";
    public static final String SCRIPT = "Dulce tentación, perfecto en cada ocasión";
    public static final String ENCABEZADO_BIENVENIDA = "PANTALLA DE BIENVENIDA";
    public static final String ENCABEZADO_PEDIDO = "INGRESO DE PEDIDO";
    public static final String ENCABEZADO_COBRO = "COBRO DE PEDIDO";
    public static final String ENCABEZADO_ESTADO = "ESTADO DE PEDIDOS";
    public static final String ENCABEZADO_ENTREGAR = "ENTREGAR PEDIDOS";
    public static final String TIPO_CHURRO = "Tipo churro:";
    public static final String SABOR = "-Sabores: ";
    public static final String BEBIDA = "-Bebidas:";
    public static final String RESUMEN_PEDDIO = "Resumen:";

    //Métodos
    public static String[] getMenuBienvenida() {
        String[] menu = {"1. Ingresar Pedido", "2. Estado de Pedidos", "3. Entregar Pedidos", "4. Salir"};
        return menu;
    }

    public static String[] getTipoChurro() {
        String[] menu = {"1. Churro clásico", "2. Porra", "3.Relleno", "4. Especial"};
        return menu;
    }

    public static String[] getSabor() {
        String[] menu = {"1.Clásico", "2.Chocolate", "3.Chocolate blanco", "4.Vainilla", "5.Dulce de leche", "6.Avellanas", "7.Fresa", "8.Pistacho", "9.Oreo"};
        return menu;
    }

    public static String[] getBebida() {
        String[] menu = {"1.Agua ", "2.Limonada ", "3.Cola", "4.Zumo", "5.Té con limón", "6.Infusiones", "7.Agua con gas", "8.Suizo", "9.Cerveza"};
        return menu;
    }

    public static String[] getResumenPedido() {
        String[] resumen = {" | Producto     ", "| Cantidad |", "Precio Unitario|", "Precio total"};

        return resumen;
    }

}
