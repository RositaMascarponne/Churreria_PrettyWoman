package entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisa
 */
public class Churro {

    //Atributos de la clase churro
    private int churroId;
    private String churroNombre;
    private int churroCantidad;
    private float churroPrecio;
    private float precioUnitario;

    //Constructores
    public Churro() {

    }

    public Churro(int churroId, String churroNombre, int churroCantidad, float churroPrecio, float precioUnitario) {
        this.churroId = churroId;
        this.churroNombre = churroNombre;
        this.churroPrecio = churroPrecio;
        this.churroCantidad = churroCantidad;
        this.precioUnitario = precioUnitario;

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
    
    public int getChurroCantidad(){
        return this.churroCantidad;
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

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    //Métodos
    public float getPrecioTotal() {
        return churroCantidad * precioUnitario;
    }
    
    // Método para cargar churros desde la base de datos
        public void cargarDesdeBaseDeDatos(Connection conn, int id) throws SQLException {
        String query = "SELECT churroNombre, churroCantidad, churroPrecio FROM churros WHERE id = 1";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            // Asignar valores desde la base de datos a los atributos
            this.churroNombre = rs.getString("nombre");
            this.churroCantidad = rs.getInt("cantidad");
            this.precioUnitario = rs.getFloat("precio_unitario");
            this.churroPrecio = this.churroCantidad * this.precioUnitario;
        }

        rs.close();
        stmt.close();
    }

    @Override
    public String toString() {
        return "Churro{" + "churroId=" + churroId + ",churroNombre=" + churroNombre + ",churroPrecio=" + churroPrecio + '}';
    }

}
