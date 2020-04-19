package implementacion.modelo;

import java.util.List;

/**
 *
 * @author mgonzalez
 */
public class Empresa {
    private int id;
    private String nombre;
    private List<Persona> personas;
    
    public Empresa(){
    }
    
    /**
     * 
     * @param id
     * @param nombre
     * @param personas 
     */
    public Empresa(int id, String nombre, List<Persona> personas) {
        this.id = id;
        this.nombre = nombre;
        this.personas = personas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    
}
