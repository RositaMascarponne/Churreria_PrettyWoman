package entidades;
/**
 *
 * @author luisa
 */
public class Estado {
    private int estadoId;
    private String estadoNombre;
    
    //Constructores
    
    public Estado() {
    }

    public Estado(String estadoNombre) {
        this.estadoNombre = estadoNombre;
    }
    //Getters

    public int getEstadoId() {
        return this.estadoId;
    }

    public String getEstadoNombre() {
        return this.estadoNombre;
    }
    //Método

    @Override
    public String toString() {
        return "Estado{" + "estadoId=" + estadoId + ", estadoNombre=" + estadoNombre + '}';
    }       
}
