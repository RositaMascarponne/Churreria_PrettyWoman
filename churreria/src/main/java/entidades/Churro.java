package entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisa
 */
public class Churro {

    private Connection conn;

    public Churro(Connection conn) {
        this.conn = conn;
    }

    public void mostrarChurro() throws SQLException {
        String sql = "SELECT * FROM churros";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt("churroID") + ": " + rs.getString("churroNombre"));
        }
    }

    public void agregarChurro(String nombre) throws SQLException {
        String sqlInsert = "INSERT INTO churros(churroNombre) VALUES('" + nombre + "')";
        Statement st = conn.createStatement();
        st.executeUpdate(sqlInsert);
        System.out.println("Churro agregado: " + nombre);
    }

}
