package entidades;
/**
 *
 * @author luisa
 */
public abstract class Pantalla {
    //Atributos de la clas Pantalla
    public static final String COMPANY = "CHURRERÍA PRETTY WOMAN";
    public static final String SCRIPT = "Dulce tentación, perfecto en cada ocasión";
    public static final String ENCABEZADO_BIENVENIDA = "-PANTALLA DE BIENVENIDA-";
    
    //Métodos
    
    public static String[] getMenuBienvenida(){
        String[] menu = {" 1. Ingresar Pedido", "2. Estado de Pedidos", "3.Entregar Pedidos", "4.Salir"};
        return menu;
    }
}
