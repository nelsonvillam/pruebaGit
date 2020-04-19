package implementacion.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import implementacion.modelo.Empresa;
import implementacion.modelo.Persona;
import implementacion.servicio.Servicio;

public class Controller {
	Servicio servicio;
	List<Empresa> empresas = null;
	private final static Logger LOGGER = Logger.getLogger(Controller.class.getName());

	public Controller(Servicio servicio) {
		this.servicio = servicio;
		empresas = servicio.getStore().getEmpresas();
	}

	private List<String> personasEmpresa(int idEmpresa) {

		Empresa empresa = empresas.stream().filter(e -> e.getId() == idEmpresa).findFirst()
				.orElseThrow(IllegalArgumentException::new);
		List<Persona> personas = empresa.getPersonas();
		return personas.stream().map(p -> p.getPrimerNombre() + " " + p.getApellidoPaterno() + " "
				+ p.getApellidoMaterno().substring(0, 1).toUpperCase() + ".").collect(Collectors.toList());
	}

	private List<Integer> empresasId() {
		return empresas.stream().map(m -> m.getId()).collect(Collectors.toList());
	}

	public void logica() {
		empresasId().forEach((id) -> {
			LOGGER.log(Level.INFO, "id = {0}", id);
		});

		int idEmpresa = empresasId().stream().findFirst().orElse(0);
		personasEmpresa(idEmpresa).forEach((persona) -> {
			LOGGER.log(Level.INFO, "Nombres = {0}", persona);
		});

	}
}
