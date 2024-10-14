package entidades;

/**
 *
 * @author luisa
 */
public class Pedido {

    //Atributos de la clase Pedido
    private int pedidoId;
    private int churroId;
    
    private int estado_Id;
    private int pedidoCantidad;
    private static final int ESTADO_ID = 1;

    //Constructores
    public Pedido() {
        this.estado_Id = Pedido.ESTADO_ID;
    }

    public Pedido(int pedidoId, int churroId, int pedidoCantidad) {
        this.pedidoId = pedidoId;
        this.churroId = churroId;
       
        this.estado_Id = Pedido.ESTADO_ID;
        this.pedidoCantidad=pedidoCantidad;
        
    }

    //Getters
    public int getPedidoId() {
        return pedidoId;
    }

    public int getChurroId() {
        return churroId;
    }



    public int getEstado_Id() {
        return estado_Id;
    }
    
    public int getPedidoCantidad(){
        return this.pedidoCantidad;
    }
//Setters

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public void setChurroId(int churroId) {
        this.churroId = churroId;
    }

  
    
    public void setPedidoCantidad(int pedidoCantidad){
        this.pedidoCantidad=pedidoCantidad;
    }

    public void setEstado_Id(int estado_Id) {
        this.estado_Id = estado_Id;
    }
//Métodos 

    @Override
    public String toString() {
        return "Pedido{" + "pedidoId=" + pedidoId + ", churroId=" + churroId + ",pedidoCantidad=" +pedidoCantidad+", estado_Id=" + estado_Id + '}';
    }

}