package entidades;
/**
 *
 * @author luisa
 */
public class Bebida {
    private int bebidaId;
    private String bebidaNombre;
    
    //Constructores

    public Bebida() {
    }

    public Bebida( int bebidaId,String bebidaNombre) {
        this.bebidaId=bebidaId;
        this.bebidaNombre = bebidaNombre;
    }
    //Getters

    public int getBebidaId() {
        return bebidaId;
    }

    public String getBebidaNombre() {
        return bebidaNombre;
    }
    //Setters
    public void setBebidaId(int bebidaId){
        this.bebidaId=bebidaId;
    }
    
    public void setBebidaNombre(String bebidaNombre){
        this.bebidaNombre=bebidaNombre;
    }
    //Métodos

    @Override
    public String toString() {
        return "Bebida{" + "bebidaId=" + bebidaId + ", bebidaNombre=" + bebidaNombre + '}';
    }
    
}
