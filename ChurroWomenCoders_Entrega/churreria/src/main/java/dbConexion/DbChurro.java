package dbConexion;

import java.sql.ResultSet;
import java.sql.Statement;
import entidades.Churro;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author luisa
 */
public abstract class DbChurro {

    private static Statement churroStatement = DbConnection.STATEMENT;

    public static Churro getChurro(String churroNombre) {
        Churro miChurro = new Churro();
        ResultSet resultado;
        String querry = "SELECT churroNombre, churroID, churroPrecio FROM churros WHERE churroNombre = '" + churroNombre + "'";

        //Consultando tabla Churro 
        try {
            resultado = churroStatement.executeQuery(querry);
            while (resultado.next()) {
                miChurro.setChurroNombre(resultado.getString("churroNombre"));
                miChurro.setChurroId(resultado.getInt("churroID"));
                miChurro.setChurroPrecio(resultado.getFloat("churroPrecio"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return miChurro;

    }

    //Creando el metodo update
    public static void updatePedido(int numeroPedido, LocalDate fechaHoy, int estado) {

        String sql = "UPDATE `churreria_pretty_woman`.`pedidos`"
                + " SET `estado_ID` = " + estado + "WHERE `numeroPedido` =" + numeroPedido + "AND fechaPedido = '" + fechaHoy + "'";

        try {
            churroStatement.executeUpdate(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("No sepudo actualizar el registro");

        }
    }
}
