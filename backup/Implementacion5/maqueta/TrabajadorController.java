
@ApplicationScope
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

  ...

}
