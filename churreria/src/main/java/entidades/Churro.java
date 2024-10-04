package entidades;

/**
 *
 * @author luisa
 */
public class Churro {

    //Atributos de la clase churro
    private int churroId;
    private String churroNombre;
    private float churroPrecio;
    private int tipoId;
    private int saborId;

    //Constructores
    public Churro() {

    }

    public Churro(int churroId, String churroNombre, float churroPrecio, int tipoId, int saborId) {
        this.churroId = churroId;
        this.churroNombre = churroNombre;
        this.churroPrecio = churroPrecio;
        this.tipoId = tipoId;
        this.saborId = saborId;
    }
    //Getters

    public int getChurroId() {
        return this.churroId;
    }

    public String getChurroNombre() {
        return this.churroNombre;
    }

    public float getChurroPrecio() {
        return this.churroPrecio;
    }

    public int getTipoId() {
        return this.tipoId;
    }

    public int getSaborId() {
        return this.saborId;
    }

    //Setters
    public void setSaborID(int saborId) {
        this.saborId = saborId;
    }

    public void setChurroNombre(String churroNombre) {
        this.churroNombre = churroNombre;
    }

    public void setChurroPrecio(float churroPrecio) {
        this.churroPrecio = churroPrecio;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public void setSaborId(int saborId) {
        this.saborId = saborId;
    }

    //Métodos
    @Override
    public String toString() {
        return "Churro{" + "churroId=" + churroId + ",churroNombre=" + churroNombre + ",churroPrecio=" + churroPrecio + '}';
    }

}
