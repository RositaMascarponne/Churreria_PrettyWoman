package dbConexion;

import entidades.Pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class DbPedido {

    private static Statement pedidoStatement = DbConnection.STATEMENT;

    public static void insertNewPedido(Pedido miPedido) {

        String query = "INSERT INTO `churreria_pretty_woman`.`pedidos` (`pedidoID`, `churroID`, `estado_ID`) "
                + "VALUES ('" + miPedido.getPedidoId()
                + "', '" + miPedido.getChurroId()
                + "', '" + miPedido.getEstado_Id() + "')";

        try {
            pedidoStatement.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
