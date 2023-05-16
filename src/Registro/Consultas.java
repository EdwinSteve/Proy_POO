package Registro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consultas {
    
    Connection_DB condb = new Connection_DB();
    Connection con = condb.getConexion();
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public boolean registrar(Registro1 usr) {

        String sql = "INSERT INTO tipo_usuario (usr, psswrd) VALUES (?,?)";

        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getContraseña());
            ps.execute();

            return true;
        } catch (SQLException ex)
        {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ex" + ex);
            return false;
        }

    }
    
    public int existeuser(String usr){
    
    String sql = "SELECT count(id) FROM tipo_usuario WHERE usr = ?";

        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr);
            rs = ps.executeQuery();

            if (rs.next())
            {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex)
        {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
}