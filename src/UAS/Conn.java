/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Conn extends GBarang {
    private static Connection KoneksiDatabse;
    public static Connection koneksiDB() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String DB ="jdbc:mysql://localhost:3306/pbo";
            String usr="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabse = (Connection) DriverManager.getConnection(DB,usr,pass);

        } catch (SQLException e) {

            System.err.println(e.getMessage());
            System.exit(0);
        }
         return KoneksiDatabse;
    }
        
}

