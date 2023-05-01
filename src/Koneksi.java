/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alvinda Akbar
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Koneksi {
    private static Connection mysqlconfig;
    public static Connection getConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/db_perpustakaan";
//            String url = "jdbc:mysql://localhost:3306/pt_maju_bersama";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e){
           System.err.println("Koneksi gagal" + e.getMessage()); 
        }
        
        return mysqlconfig;
    }
    
}
