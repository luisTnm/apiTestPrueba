package com.ejercicio7.apiEjercicio7.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int usuarioId;
	@Column(name="nombre")
	private String nombre;
	@Column(name="ine")
	private String ine;
	@Column(name="direccion")
	private String direccion;
	@Column(name="telefono")
	private String telefono;
	
	public Cliente() {}

	public Cliente(int usuarioId, String nombre, String ine, String direccion, String telefono) {
		super();
		this.usuarioId = usuarioId;
		this.nombre = nombre;
		this.ine = ine;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIne() {
		return ine;
	}

	public void setIne(String ine) {
		this.ine = ine;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [usuarioId=" + usuarioId + ", nombre=" + nombre + ", ine=" + ine + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	

}
