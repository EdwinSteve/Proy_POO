/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author edwin
 */
public class Connection_DB {
    
    private static final String base = "poo";
    private static final String user = "root";
    private static final String password = "root";
    private static final String url = "jdbc:mysql://localhost:3306/" + base;
    
    public Connection getConexion(){
        Connection con = null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, password); 
    }   catch (Exception ex)
        {
            Logger.getLogger(Connection_DB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ex" + ex);
        }
        
        return con;
    }
}
