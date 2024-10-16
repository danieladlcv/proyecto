/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clasesproyecto;

import Daos.RestriccionAlimenticiaDao;
import Interfacesmodelo.Restrialimenticia;
import java.sql.Connection;
/**
 *
 * @author Michael
 */
public class RestriccionAlimenticiaFactory {
    
    
    public static Restrialimenticia ObjetoRestricionAlimenticiaDao(Connection connection){
        
         return new RestriccionAlimenticiaDao(connection); 
         
     
     
     }
    
    
    
    
}
