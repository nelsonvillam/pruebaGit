package implementacion;

/**
 *
 * @author mgonzalez
 */
public class ClasificacionAdolecente implements ClasificacionPersonaInterface{

    @Override
    public int getEdadMinima() {
        return 12;
    }

    @Override
    public int getEdadMaxima() {
        return 18;
    }

    @Override
    public TipoClasificacionEnum getTipo() {
        return TipoClasificacionEnum.ADOLECENTE;
    }

    @Override
    public String getDescripcion() {
        return "rango de adolescencia (12-18 años)";
    }
    
}
