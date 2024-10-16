/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clasesproyecto;
import Interfacesmodelo.Usu; 
import Daos.UsuarioDao;
import Base.DatabaseConnection; 
import java.sql.Connection;
/**
 *
 * @author Michael
 */
public class UsuarioFactory {
    
     public static Usu ObjetoUsudao(Connection connection){
        
         return new UsuarioDao(connection); 
         
     
     
     }
    
    
    
    
}
