/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javaapplication3.connection.DbConnection;
import javaapplication3.views.MahasiswaView;

/**
 *
 * @author admin
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MahasiswaView().setVisible(true);
//        new DbConnection().getConnection();
    }
    
}
