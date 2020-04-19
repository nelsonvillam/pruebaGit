package implementacion;

/**
 *
 * @author mgonzalez
 */
public interface ClasificacionPersonaInterface {
    public int getEdadMinima();
    public int getEdadMaxima();
    public TipoClasificacionEnum getTipo();
    public String getDescripcion();
    
    /**
     * Retorna detalle
     * @return 
     */
    default public String getDetalle(){
       return "Tipo: " + getTipo() + " min: " + getEdadMinima() + " max: " + getEdadMaxima();
    }
}
