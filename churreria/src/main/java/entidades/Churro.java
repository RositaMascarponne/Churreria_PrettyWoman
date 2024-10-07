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
    public void cargarDesdeBaseDeDatos(Connection conexion, int id) throws SQLException {
        String consulta = "SELECT nombre, precio_unitario FROM churros WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(consulta)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                this.churroId = id;
                this.churroNombre = rs.getString("nombre");
                this.precioUnitario = rs.getFloat("precio_unitario");
                this.churroCantidad = 1; // Por defecto 1, pero se puede cambiar según el pedido
            } else {
                throw new SQLException("Churro con ID " + id + " no encontrado.");
            }
        }
    }

    @Override
    public String toString() {
        return "Churro{" + "churroId=" + churroId + ",churroNombre=" + churroNombre + ",churroPrecio=" + churroPrecio + '}';
    }

}
