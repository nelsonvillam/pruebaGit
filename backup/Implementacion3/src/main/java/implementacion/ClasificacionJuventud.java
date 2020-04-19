package implementacion;

/**
 *
 * @author mgonzalez
 */
public class ClasificacionJuventud implements ClasificacionPersonaInterface{

    @Override
    public int getEdadMinima() {
        return 19;
    }

    @Override
    public int getEdadMaxima() {
        return 26;
    }

    @Override
    public TipoClasificacionEnum getTipo() {
        return TipoClasificacionEnum.JOVEN;
    }

    @Override
    public String getDescripcion() {
        return "rango de juventud  (19-26 años)";
    }
    
}
