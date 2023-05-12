package Registro;
import java.*;
public class connection_DB {

    private static final String bd = "poo";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/" + bd;

    public Connection getConexion(){

        connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (Exeption ex){

            Logger.getLogger(Connection_DB.class.getName().log(level.SEVERE, null, ex))
            System.out.println("ex" + ex);
        }

    }

}