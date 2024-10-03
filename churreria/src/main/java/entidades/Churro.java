package entidades;
/**
 *
 * @author luisa
 */
public class Churro {
    //Atributos de la clase churro
    private int churroId;
    private String churroNombre;
    private String churroPrecio;
    
    //Constructores
    public Churro(){
        
    }
    
   public Churro(String churroNombre, String churroPrecio){
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
   public String getChurroPrecio(){
       return this.churroPrecio;
   }
   //Métodos
   @Override
   public String toString(){
      return "Churro{" + "churroId=" + churroId + ",churroNombre=" + churroNombre + ",churroPrecio=" + churroPrecio + '}';
   }
        
}
