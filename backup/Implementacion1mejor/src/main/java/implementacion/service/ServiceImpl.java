package implementacion.service;

import implementacion.model.Model;
import implementacion.util.OperacionesMatematicas;

public class ServiceImpl extends OperacionesMatematicas implements Service {

	public double calculaMayor(Model modelo) {
		if (modelo.getNumero1() > modelo.getNumero2()) {
			return modelo.getNumero1();
		} else {
			return modelo.getNumero2();
		}
	}

	public double calculaMenor(Model modelo) {

		if (modelo.getNumero1() < modelo.getNumero2()) {
			return modelo.getNumero1();
		} else {
			return modelo.getNumero2();
		}
	}

}
