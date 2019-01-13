/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryconnection;

import java.sql.*;

public class conectar {
    
    
    Connection conectar =  null;
    public Connection conexion(){
        
        
        
       try{
           Class.forName("com.mysql.jdbc.Driver");
           conectar = DriverManager.getConnection("jdbc:mysql://localhost/AndroidPHP","root","");
           if(conectar != null){
            System.out.println("conexion exitosa");
        }
           
       }catch(Exception e){
           System.out.println(e.getMessage());
           
       }
       return conectar;
    }
}
