package dbConexion;

import entidades.Pedido;
import java.sql.PreparedStatement;
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

    // Reutilizando la conexión existente
    private static java.sql.Connection connection = DbConnection.getConnection(); // Asegúrate de tener un método para obtener la conexión

    public static void insertNewPedido(Pedido miPedido) {
        String query = "INSERT INTO `churreria_pretty_woman`.`pedidos` (`churroID`, `pedidoCantidad`, `estado_ID`) "
                + "VALUES (?, ?, ?)"; // Se eliminó pedidoID para que sea autoincremental

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            // Asignando los valores a la consulta
            preparedStatement.setInt(1, miPedido.getChurroId());
            preparedStatement.setInt(2, miPedido.getPedidoCantidad());
            preparedStatement.setInt(3, miPedido.getEstado_Id());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Pedido insertado exitosamente.");
            } else {
                System.out.println("No se pudo insertar el pedido.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}