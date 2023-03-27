/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookShop;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author vajir
 */
public class Connect {
    public static Connection connectMe(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/BookShop", "root", "");
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return con;
    }
}
