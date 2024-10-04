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

    public Sabor(String saborNombre) {
        this.saborNombre = saborNombre;
    }
    //Getters

    public int getSaborId() {
        return this.saborId;
    }

    public String getSaborNombre() {
        return this.saborNombre;
    }
    //Metodos

    @Override
    public String toString() {
        return "Sabor{" + "saborId=" + saborId + ", saborNombre=" + saborNombre + '}';
    }
        
}
