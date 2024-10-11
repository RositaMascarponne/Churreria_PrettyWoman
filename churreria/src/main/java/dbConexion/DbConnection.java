package dbConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author luisa
 */

public abstract class DbConnection {

    //Datos DB
    private static final String URL = "jdbc:mysql://localhost:3308";
    private static final String DATABASE = "churreria_pretty_woman";
    private static final String USER = "root";
    private static final String PASS ="root";

    //CONEXION DB
    public static Statement STATEMENT;

    //Métodos
    //MAKE CONNECTION
    public static Connection getConnection() {
        Connection connection = null;

        try {

            connection = DriverManager.getConnection(DbConnection.URL + "/" + DbConnection.DATABASE, DbConnection.USER, DbConnection.PASS);
            STATEMENT = connection.createStatement();
            System.out.println("Data Base Connection OK");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}