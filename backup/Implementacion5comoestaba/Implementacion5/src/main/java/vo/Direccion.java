package vo;
import java.io.Serializable;

public class Direccion implements Serializable {

	private String calle;
	private String depto;
	private Integer nro;
	// ...

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public Integer getNro() {
		return nro;
	}
	public void setNro(Integer nro) {
		this.nro = nro;
	}

	
}
