/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3.connection;

import java.sql.*;

/**
 *
 * @author admin
 */
public class DbConnection {
    private String driver, url, db, user, pass;
    
    public DbConnection() {
        driver = "com.mysql.cj.jdbc.Driver";
        db  = "pbo";
        url = "jdbc:mysql://localhost:3307/" + db;
        user = "root";
        pass = "temp123";
    }
    
    public Connection getConnection() {
        Connection con = null;
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Success connect to DB");
        } catch(ClassNotFoundException er) {
            System.out.println("Error #1: " + er.getMessage());
            System.exit(0);
        } catch (SQLException er) {
            System.out.println("Error #2: " + er.getMessage());
            System.exit(0);
        }
        
        return con;
    }
}
