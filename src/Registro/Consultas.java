/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edwin
 */
public class Consultas {
    
    Connection_DB condb = new Connection_DB();
    Connection con = condb.getConexion();
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public boolean registrar(Registro1 usr) {

        String sql = "INSERT INTO usuarios (usr, psswd) VALUES (?,?)";

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
    
    public boolean login(Registro1 usr) {

        String sql = "SELECT id, usr, psswd FROM usuarios WHERE usr = ?";

        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next())
            {
                if (usr.getContraseña().equals(rs.getString(3)))
                {
                    usr.setId(rs.getInt(1));
                    return true;
                } else
                {
                    return false;
                }
            }
            return false;

        } catch (SQLException ex)
        {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int existeuser(String usr){
    
    String sql = "SELECT count(id) FROM usuarios WHERE usr = ?";

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
