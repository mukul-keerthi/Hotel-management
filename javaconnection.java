/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mukul
 */

import java.sql.*; //Importing classes
import javax.swing.JOptionPane;
public class javaconnection {
    
    Connection connect; //Object of connection class
    public static Connection ConnectDb(){
    
        try{
        // load driver manager
        Class.forName("org.sqlite.JDBC");
        // To setup DB connection
        Connection connect = DriverManager.getConnection("C:\\Users\\Mukul\\Documents\\NetBeansProjects\\The mohtel\\MohtelDB.db"); //address of database
        return connect;
        
        }
        
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        
        }
        
    }
}
