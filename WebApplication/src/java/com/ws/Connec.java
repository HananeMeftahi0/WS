/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hanane
 */
public class Connec {
    public static Connection connectionDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/university","root",""); 
            System.out.println("Connected");
            return conn;
            
        } catch (Exception ex) {
                  System.out.println("Not Connected");
            return null;
        }
            
        
    }
    
}
