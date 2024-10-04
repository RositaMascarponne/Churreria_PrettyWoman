package entidades;

/**
 *
 * @author luisa
 */
public class Bebida {

    private int bebidaId;
    private String bebidaNombre;
    private float bebidaPrecio;

    //Constructores
    public Bebida() {
    }

    public Bebida(int bebidaId, String bebidaNombre, float bebidaPrecio) {
        this.bebidaId = bebidaId;
        this.bebidaNombre = bebidaNombre;
        this.bebidaPrecio = bebidaPrecio;
    }
    //Getters

    public int getBebidaId() {
        return bebidaId;
    }

    public String getBebidaNombre() {
        return bebidaNombre;
    }

    public float getBebidaPrecio(float bebidaPrecio) {
        return this.bebidaPrecio;
    }

    //Setters
    public void setBebidaId(int bebidaId) {
        this.bebidaId = bebidaId;
    }

    public void setBebidaNombre(String bebidaNombre) {
        this.bebidaNombre = bebidaNombre;
    }

    public void setBebidaPrecio(float bebidaPrecio) {
        this.bebidaPrecio = bebidaPrecio;
    }
    //Métodos

    @Override
    public String toString() {
        return "Bebida{" + "bebidaId=" + bebidaId + ", bebidaNombre=" + bebidaNombre + ", bebidaPrecio=" +bebidaPrecio+ '}';
    }

}
