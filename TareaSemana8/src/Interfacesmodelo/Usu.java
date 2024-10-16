/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfacesmodelo;

import java.util.List;
import Clasesproyecto.Usuario;

/**
 *
 * @author Michael
 */
public interface Usu {
    List<Usuario> mostrarUsu();
    Usuario mostrarunUsu(int id); 
    void updateUsu (int id, String nombre, String email, String password); 
    void ingresoUsu (Usuario usua); 
    void deleteUsu (int id); 
}
