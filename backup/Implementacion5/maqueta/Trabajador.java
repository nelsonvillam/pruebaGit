
public class Trabajador {

  private String nombre;
  private Integer rut;
  private List<Direccion> direcciones;

  ...

  public void addDirecciones(Direccion direccion) {
    if (this.direcciones == null) {
      this.direcciones = new ArrayList();
    }

    this.direcciones.add(direccion);
   }

}
