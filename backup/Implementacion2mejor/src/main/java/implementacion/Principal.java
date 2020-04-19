package implementacion;

import java.util.logging.Level;
import java.util.logging.Logger;

import implementacion.controller.Controller;
import implementacion.servicio.ServicioImpl;

/**
 *
 * @author Nelson Villamizar
 */
public class Principal {
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		ServicioImpl servicio = new ServicioImpl();

		Controller controller = new Controller(servicio);
		controller.logica();

	}

}
