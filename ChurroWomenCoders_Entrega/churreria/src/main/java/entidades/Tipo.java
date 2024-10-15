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

    public Tipo(int tipoId, String tipoNombre) {
        this.tipoId = tipoId;
        this.tipoNombre = tipoNombre;
    }
    //Getters

    public int getTipoId() {
        return tipoId;
    }

    public String getTipoNombre() {
        return tipoNombre;
    }

    //Setters
    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public void setTipoNombre(String tipoNombre) {
        this.tipoNombre = tipoNombre;
    }
    //Métodos

    @Override
    public String toString() {
        return "Tipo{" + "tipoId=" + tipoId + ", tipoNombre=" + tipoNombre + '}';
    }

}
