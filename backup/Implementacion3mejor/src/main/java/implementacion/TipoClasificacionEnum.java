
package implementacion;

/**
 *
 * @author nvillamizar
 */
public enum TipoClasificacionEnum {
	ADOLECENTE(12, 18), 
	JOVEN(19, 26), 
	ADULTO(27, 50), 
	ADULTO_MAYOR(51, 100);

	private String detalle;

	TipoClasificacionEnum(int edadMinima, int edadMaxima) {
		detalle = "Tipo: " + (this) + " min: " + edadMinima 
				+ " max: " + edadMaxima;
	}

	public String getDetalle() {
		return detalle;
	}

}
