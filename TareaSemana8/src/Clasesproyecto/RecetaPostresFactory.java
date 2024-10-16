/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clasesproyecto;

 
import Interfacesmodelo.RecetPostre;
import java.sql.Connection;
import Daos.RecetaPostresDao; 

/**
 *
 * @author Michael
 */
public class RecetaPostresFactory {
    
    public static RecetPostre ObjetoRecetaPostresdao(Connection connection){
        
         return new RecetaPostresDao(connection); 
            
     }
    
    
    
}
