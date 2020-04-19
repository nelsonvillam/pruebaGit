package service.impl;

import javax.inject.Inject;

import dao.TrabajadorDAO;
import model.Trabajador;
import service.TrabajadorService;

public class TrabajadorServiceImpl implements TrabajadorService {
	@Inject
	private TrabajadorDAO trabajadorDAO;

	@Override
	public void guardar( Trabajador trabajador) {
		trabajadorDAO.save(trabajador);

	}

}
