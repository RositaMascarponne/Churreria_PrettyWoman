package entidades;
/**
 *
 * @author luisa
 */
public class Tipo {
    private int tipoId;
    private String tipoNombre;
    
    //Constructores

    public Tipo() {
    }

    public Tipo(String tipoNombre) {
        this.tipoNombre = tipoNombre;
    }
    //Getters

    public int getTipoId() {
        return tipoId;
    }

    public String getTipoNombre() {
        return tipoNombre;
    }
    //Métodos

    @Override
    public String toString() {
        return "Tipo{" + "tipoId=" + tipoId + ", tipoNombre=" + tipoNombre + '}';
    }
    
}
