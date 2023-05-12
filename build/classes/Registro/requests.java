package Registro;
import java.*;

public class requests {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection_DB condb = new Connection_DB();
    Connection con = condb.getConexion();

    public boolean registrar(Cliente usr){

        String sql = "INSERT INTO usuarios () VALUES ()";

        try {

            ps = con.PrepareStatement(sql);
            ps.setString(?,usr.getNo_cuenta());
            ps.setStrin(?,usr.getPasswd());
            ps.execute();
            return true;

        }catch (SQLExeption ex){

            Logger.getLogger(requests.class.getName().log(level.SEVERE, null, ex))
            System.out.println("ex" + ex);
            return false

        }
    }

    public boolean ingresar(Cliente usr){

        String sql = "SELECT ? FROM usuarios WHERE user = ?"


    }



}