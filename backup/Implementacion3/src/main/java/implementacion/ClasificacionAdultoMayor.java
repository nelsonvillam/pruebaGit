package implementacion;

/**
 *
 * @author mgonzalez
 */
public class ClasificacionAdultoMayor implements ClasificacionPersonaInterface{

    @Override
    public int getEdadMinima() {
        return 51;
    }

    @Override
    public int getEdadMaxima() {
        return 100;
    }

    @Override
    public TipoClasificacionEnum getTipo() {
        return TipoClasificacionEnum.ADULTO_MAYOR;
    }

    @Override
    public String getDescripcion() {
        return "rango de adolescencia (51-100 años)";
    }
    
}
