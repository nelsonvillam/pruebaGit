package implementacion;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase creada solo para contener datos para el ejemplo
 * @author mgonzalez
 */
public class Store {
    final List<Empresa> empresas;
    public Store() {
        empresas = new ArrayList();
        List<Persona> personas = new ArrayList();
        Date fecha1 = Date.from(Instant.parse("1995-10-23T10:12:35Z"));
        Persona persona1 = new Persona("Juan","Antonio","Rojas","Sandoval",fecha1,"juan@gmail.com");
        
        Date fecha2 = Date.from(Instant.parse("1963-02-01T12:06:10Z"));
        Persona persona2 = new Persona("Claudio","Jose","Aralla","Bellone",fecha2,"claudio@gmail.com");
        
        Date fecha3 = Date.from(Instant.parse("1970-08-01T04:11:11Z"));
        Persona persona3 = new Persona("Jose","Alejandro","Ribera","Gonzalez",fecha3,"claudio@gmail.com");
        
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
                
        List<Persona> lista1 = new ArrayList();
        lista1.add(persona3);
        lista1.add(persona1);
        Empresa empresa1 = new Empresa(1,"Empresa 1", lista1);
        empresas.add(empresa1);
        
        List<Persona> lista2 = new ArrayList();
        lista2.add(persona1);
        lista2.add(persona2);
        Empresa empresa2 = new Empresa(2,"Empresa 2", lista2);
        empresas.add(empresa2);
    }
}
