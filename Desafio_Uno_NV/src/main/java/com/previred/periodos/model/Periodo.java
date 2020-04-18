package com.previred.periodos.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
*
* @author Nelson Villamizar
*/
@Validated

public class Periodo {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("fechaCreacion")
	private LocalDate fechaCreacion = null;

	@JsonProperty("fechaFin")
	private LocalDate fechaFin = null;

	@JsonProperty("fechas")
	@Valid
	private List<LocalDate> fechas = null;

	public Periodo id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Periodo fechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
		return this;
	}

	/**
	 * Get fechaCreacion
	 * 
	 * @return fechaCreacion
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Periodo fechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
		return this;
	}

	/**
	 * Get fechaFin
	 * 
	 * @return fechaFin
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Periodo fechas(List<LocalDate> fechas) {
		this.fechas = fechas;
		return this;
	}

	public Periodo addFechasItem(LocalDate fechasItem) {
		if (this.fechas == null) {
			this.fechas = new ArrayList<>();
		}
		this.fechas.add(fechasItem);
		return this;
	}

	/**
	 * Get fechas
	 * 
	 * @return fechas
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<LocalDate> getFechas() {
		return fechas;
	}

	public void setFechas(List<LocalDate> fechas) {
		this.fechas = fechas;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Periodo periodo = (Periodo) o;
		return Objects.equals(this.id, periodo.id) && Objects.equals(this.fechaCreacion, periodo.fechaCreacion)
				&& Objects.equals(this.fechaFin, periodo.fechaFin) && Objects.equals(this.fechas, periodo.fechas);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, fechaCreacion, fechaFin, fechas);
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
