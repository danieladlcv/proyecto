/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clasesproyecto;

import Daos.PreferenciasDao;
import Interfacesmodelo.Preferencia;
import java.sql.Connection;

/**
 *
 * @author Michael
 */
public class PreferenciasFactory {
    
    
    public static  Preferencia ObjetoPreferenciasDao(Connection connection){
        
         return new PreferenciasDao(connection); 
           
     }
    
    
    
}
