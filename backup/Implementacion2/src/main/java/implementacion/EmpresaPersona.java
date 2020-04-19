package implementacion;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author mgonzalez
 */
public class EmpresaPersona extends Store{
    
    /**
     * Retorna la lista de empleados de una empresa por su id
     * @param idEmpresa id de la empresa
     * @return Lista de string con los nombres de las personas
     */
    public List<String> personasEmpresa(int idEmpresa){
        Empresa empresa = super.empresas.stream().filter(e-> e.getId() == idEmpresa).findFirst().orElseThrow(IllegalArgumentException::new);
        List<Persona> personas = empresa.getPersonas();
        return personas.stream().
                map(p->p.getPrimerNombre()+" "+p.getApellidoPaterno()+" "+
                        p.getApellidoMaterno().substring(0,1).toUpperCase()+".")
                .collect(Collectors.toList());
    }
    
    /**
     * Retorna la lista completa de id's de empresas
     * @return Lista de idis de empresas
     */
    public List<Integer> empresasId(){
        return super.empresas.stream().map(m->m.getId()).collect(Collectors.toList());
    }
}
