/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clasesproyecto;

/**
 *
 * @author Michael
 */
public class Objetosserviciosfactory {
    public static Usuario crearservicioUsuario(int id, String nombre, String email, String password) {
        
     return new Usuario( id, nombre, email, password);
    }
    
    public static RestriccionAlimenticia crearobjetoRestriccion(int id, String alergias, boolean Gluten, boolean Lactosa, boolean Azucar, boolean Vegano, boolean Citrico, boolean Bajoengrasa) {
        return new RestriccionAlimenticia(id,alergias, Gluten,  Lactosa,  Azucar, Vegano,  Citrico,  Bajoengrasa);    
    }

 
    public static Preferencias crearservicioPreferencia(String tipopostre, String nivelactividad, int comidasaldia, boolean prefiereOrganico, boolean bajoEnAzucar, boolean altoEnProteinas) {
        return new Preferencias(tipopostre, nivelactividad, comidasaldia,prefiereOrganico, bajoEnAzucar, altoEnProteinas);
    }

    public static RecetaPostres crearservicioReceta(int id, String nombre, String tipopostre, String ingredientes, String descripcionreceta) {
        return new RecetaPostres( id,  nombre,  tipopostre,  ingredientes, descripcionreceta);
    }
}
