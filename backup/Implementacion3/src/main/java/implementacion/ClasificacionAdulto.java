package implementacion;

/**
 *
 * @author mgonzalez
 */
public class ClasificacionAdulto implements ClasificacionPersonaInterface{

    @Override
    public int getEdadMinima() {
        return 27;
    }

    @Override
    public int getEdadMaxima() {
        return 50;
    }

    @Override
    public TipoClasificacionEnum getTipo() {
        return TipoClasificacionEnum.ADULTO;
    }

    @Override
    public String getDescripcion() {
        return "rango de adulto (27-50 años)";
    }
    
}
