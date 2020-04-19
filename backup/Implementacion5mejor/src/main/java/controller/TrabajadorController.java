package controller;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import model.Direccion;
import model.Trabajador;
import service.TrabajadorService;

//@ApplicationScoped
@RequestScoped
public class TrabajadorController {

  @Inject
  private TrabajadorService trabajadorService;

  private Trabajador trabajador;

  @PostConstruct
  private void init() {
    this.trabajador = new Trabajador();
  }

  public void Direccion(Direccion direccion) {
    this.trabajador.addDirecciones(direccion);
  }

  public void guardar() {
    this.trabajadorService.guardar(this.trabajador);
  }

  //...

}
