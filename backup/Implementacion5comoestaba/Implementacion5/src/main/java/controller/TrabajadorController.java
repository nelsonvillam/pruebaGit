package controller;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dao.TrabajadorDAO;
import vo.Direccion;
import vo.Trabajador;

@ApplicationScoped
public class TrabajadorController {

  @Inject
  private TrabajadorDAO trabajadorDAO;

  private Trabajador trabajador;

  @PostConstruct
  private void init() {
    this.trabajador = new Trabajador();
  }

  public void Direccion(Direccion direccion) {
    this.trabajador.addDirecciones(direccion);
  }

  public void guardar() {
    this.trabajadorDAO.save(this.trabajador);
  }

  //...

}
