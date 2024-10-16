/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clasesproyecto;

/**
 *
 * @author Michael
 */
public class FacadeServicios {
    
    
    public Usuario registrarUsuario(int id, String nombre, String email, String password) {
        
       
        Usuario usuario = Objetosserviciosfactory.crearservicioUsuario(id, nombre, email, password);      
        return usuario;
        
     
    }

    public RestriccionAlimenticia crearRestriccion(int id, String alergias, boolean Gluten, boolean Lactosa, boolean Azucar, boolean Vegano, boolean Citrico, boolean Bajoengrasa) {
        
        RestriccionAlimenticia restriccion = Objetosserviciosfactory.crearobjetoRestriccion(id,alergias, Gluten, Lactosa, Azucar, Vegano, Citrico, Bajoengrasa);
         return restriccion; 
    }
    
   public Preferencias crearpreferencia (String tipopostre, String nivelactividad, int comidasaldia, boolean prefiereOrganico, boolean bajoEnAzucar, boolean altoEnProteínas) {
       
        Preferencias preferencia = Objetosserviciosfactory.crearservicioPreferencia(tipopostre, nivelactividad, comidasaldia,prefiereOrganico, bajoEnAzucar, altoEnProteínas);
         return preferencia;
   
   }
   
   public RecetaPostres crearservicioReceta(int id, String nombre, String tipopostre, String ingredientes, String descripcionreceta) {
       
       RecetaPostres recetapostres = Objetosserviciosfactory.crearservicioReceta(id, nombre, tipopostre, ingredientes, descripcionreceta);
       
       return recetapostres;
    
   }
   

}

