package com.ejercicio7.apiEjercicio7.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reserva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCliente;
	@Column(name="idAuto")
	private String idAuto;
	@Column(name="fechaIni")
	private String fechaIni;
	@Column(name="fechaFin")
	private String fechaFin;
	@Column(name="gasolina")
	private String gasolina;
	@Column(name="precio")
	private String precio;
	
	public Reserva() {}

	public Reserva(int idCliente, String idAuto, String fechaIni, String fechaFin, String gasolina, String precio) {
		super();
		this.idCliente = idCliente;
		this.idAuto = idAuto;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.gasolina = gasolina;
		this.precio = precio;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(String idAuto) {
		this.idAuto = idAuto;
	}

	public String getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getGasolina() {
		return gasolina;
	}

	public void setGasolina(String gasolina) {
		this.gasolina = gasolina;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Reserva [idCliente=" + idCliente + ", idAuto=" + idAuto + ", fechaIni=" + fechaIni + ", fechaFin="
				+ fechaFin + ", gasolina=" + gasolina + ", precio=" + precio + "]";
	}
	
	

}
