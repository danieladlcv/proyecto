/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfacesmodelo;

import Clasesproyecto.RestriccionAlimenticia;
import java.util.List;

/**
 *
 * @author Michael
 */
public interface Restrialimenticia {
    List<RestriccionAlimenticia> mostrarRestrialimenticia();
    RestriccionAlimenticia mostrarunRestriccionalimenticia(int id); 
    void updateRestrialimenticia (int id,String alergias, boolean gluten,boolean lactosa, boolean azucar, boolean vegano, boolean citrico, boolean bajograsa);
    void ingresoRestrialimenticia (RestriccionAlimenticia restriccion);
    void deleteRestrialimenticia (int id);   
}
