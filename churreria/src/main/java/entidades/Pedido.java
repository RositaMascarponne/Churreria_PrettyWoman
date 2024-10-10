package entidades;

/**
 *
 * @author luisa
 */
public class Pedido {

    //Atributos de la clase Pedido
    private int pedidoId;
    private int churroId;
    private int bebidaId;
    private int estado_Id;
    private static final int ESTADO_ID = 1;

    //Constructores
    public Pedido() {
        this.estado_Id = Pedido.ESTADO_ID;
    }

    public Pedido(int pedidoId, int churroId, int bebidaId) {
        this.pedidoId = pedidoId;
        this.churroId = churroId;
        this.bebidaId = bebidaId;
        this.estado_Id = Pedido.ESTADO_ID;
    }

    //Getters
    public int getPedidoId() {
        return pedidoId;
    }

    public int getChurroId() {
        return churroId;
    }

    public int getBebidaId() {
        return bebidaId;
    }

    public int getEstado_Id() {
        return estado_Id;
    }
//Setters

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setChurroId(int churroId) {
        this.churroId = churroId;
    }

    public void setBebidaId(int bebidaId) {
        this.bebidaId = bebidaId;
    }

    public void setEstado_Id(int estado_Id) {
        this.estado_Id = estado_Id;
    }
//Métodos 

    @Override
    public String toString() {
        return "Pedido{" + "pedidoId=" + pedidoId + ", churroId=" + churroId + ", bebidaId=" + bebidaId + ", estado_Id=" + estado_Id + '}';
    }

}
