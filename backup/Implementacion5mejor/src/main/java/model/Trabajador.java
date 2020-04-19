package model;
import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private String nombre;
	private Integer rut;
	private List<Direccion> direcciones;

	// ...

	public void addDirecciones(Direccion direccion) {
		if (this.direcciones == null) {
			this.direcciones = new ArrayList();
		}

		this.direcciones.add(direccion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

}
