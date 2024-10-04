package entidades;

/**
 *
 * @author luisa
 */
public class Sabor {

    private int saborId;
    private String saborNombre;

    //Constructores
    public Sabor() {
    }

    public Sabor(int saborId, String saborNombre) {
        this.saborId = saborId;
        this.saborNombre = saborNombre;
    }
    //Getters

    public int getSaborId() {
        return this.saborId;
    }

    public String getSaborNombre() {
        return this.saborNombre;
    }

    //Setters
    public void setSaborId(int saborId) {
        this.saborId = saborId;
    }

    public void setSaborNombre(String saborNombre) {
        this.saborNombre = saborNombre;
    }
    //Metodos

    @Override
    public String toString() {
        return "Sabor{" + "saborId=" + saborId + ", saborNombre=" + saborNombre + '}';
    }

}
