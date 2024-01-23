/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class tampil  extends GBarang{
    private void tampilkanData(){
        int row = tabel.getRowCount();
        for (int a=0; a<row; a++){
        tabel.removeRow(0);
        }
        try{
            Connection cn = (Connection)Conn.koneksiDB();
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM gbarang");
            while (rs.next()){
                String data[] = {(rs.getString(1)),(rs.getString(2)),(rs.getString(3)),(rs.getString(4)),(rs.getString(5)),(rs.getString(6))};
                tabel.addRow(data);
            } 
        }catch (SQLException ex){
        Logger.getLogger(GBarang.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GBarang.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
}
