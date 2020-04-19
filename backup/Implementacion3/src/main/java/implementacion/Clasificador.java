package implementacion;

/**
 *
 * @author mgonzalez
 */
public class Clasificador {
    /**
     * 
     * @param tipo
     * @return 
     */
    public ClasificacionPersonaInterface getClasificacion(TipoClasificacionEnum tipo){
        if(null != tipo){
            switch (tipo) {
                case ADOLECENTE:
                    return new ClasificacionAdolecente();
                case JOVEN:
                    return new ClasificacionJuventud();
                case ADULTO:
                    return new ClasificacionAdulto();
                case ADULTO_MAYOR:
                    return new ClasificacionAdultoMayor();
                default:
                    break;
            }
        }
        return null;
    }
}
