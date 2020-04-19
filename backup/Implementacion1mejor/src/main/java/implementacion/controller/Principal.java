package implementacion.controller;

import implementacion.model.Model;
import implementacion.service.Service;
import implementacion.service.ServiceImpl;
import implementacion.view.View;

/**
 *
 * @author mgonzalez
 */
public class Principal {

	/**
	 * @param args
	 *            the command line arguments
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Service service = new ServiceImpl();
		View view = new View();
		double numero1 = view.getValueFromUser("valor1: ");
		double numero2 = view.getValueFromUser("valor2: ");

		Model modelo = new Model(numero1, numero2);

		IngresoController controller = new IngresoController(modelo, service, view);
		controller.ingresar();
	}

}
