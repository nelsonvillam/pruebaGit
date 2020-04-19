package implementacion.controller;

import implementacion.model.Model;
import implementacion.service.Service;
import implementacion.util.OperacionesMatematicas;
import implementacion.view.View;

/**
 *
 * @author mgonzalez
 */
public class IngresoController  {

	private Service service;
	private View view;
	private Model modelo;

	public IngresoController(Model modelo, Service service, View view) {
		this.modelo = modelo;
		this.service = service;
		this.view = view;

	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public Model getModelo() {
		return modelo;
	}

	public void setModelo(Model modelo) {
		this.modelo = modelo;
	}

	/**
	 * Permite el ingreso de 2 numeros enteros para el posterior calculo de su
	 * division
	 */
	public void ingresar() {

		double mayor = service.calculaMayor(modelo);

		double menor = service.calculaMenor(modelo);

		view.displayMessage("La division entre:" + "" + mayor + "/" + menor + " =  " + service.dividir(mayor, menor));

	}
}
