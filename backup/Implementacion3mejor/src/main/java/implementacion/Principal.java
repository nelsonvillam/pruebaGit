package implementacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nvillamizar
 */
public class Principal {
	private final static Logger LOGGER = 
			Logger.getLogger(Principal.class.getName());

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		LOGGER.log(Level.INFO, "Joven = {0}", 
				(TipoClasificacionEnum.JOVEN).getDetalle());
		LOGGER.log(Level.INFO, "Adulto = {0}", 
				(TipoClasificacionEnum.ADULTO).getDetalle());
	

	}

}
