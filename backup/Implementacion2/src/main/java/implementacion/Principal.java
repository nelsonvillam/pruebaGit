package implementacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mgonzalez
 */
public class Principal {
    private final static Logger LOGGER = Logger.getLogger(Principal.class.getName());
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpresaPersona empresa = new EmpresaPersona();
        empresa.empresasId().forEach((id) -> {
            LOGGER.log(Level.INFO, "id = {0}", id);
        });
        
        int idEmpresa = empresa.empresasId().stream().findFirst().orElse(0);
        empresa.personasEmpresa(idEmpresa).forEach((persona) -> {
            LOGGER.log(Level.INFO, "Nombres = {0}", persona);
        });
    }
    
}
