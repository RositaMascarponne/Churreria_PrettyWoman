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
    
    //Constructores
    public Churro(){
        
    }
    
   public Churro(String churroNombre, float churroPrecio){
       this.churroNombre = churroNombre;
       this.churroPrecio = churroPrecio;
   }
    //Getters
   public int getChurroId(){
       return this.churroId;
   }
   public String getChurroNombre(){
       return this.churroNombre;            
   }
   public float getChurroPrecio(){
       return this.churroPrecio;
   }

    public void setChurroId(int churroId) {
        this.churroId = churroId;
    }

    public void setChurroNombre(String churroNombre) {
        this.churroNombre = churroNombre;
    }

    public void setChurroPrecio(float churroPrecio) {
        this.churroPrecio = churroPrecio;
    }
   //Métodos
   @Override
   public String toString(){
      return "Churro{" + "churroId=" + churroId + ",churroNombre=" + churroNombre + ",churroPrecio=" + churroPrecio + '}';
   }

}
