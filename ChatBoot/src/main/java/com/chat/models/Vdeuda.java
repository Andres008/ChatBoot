package com.chat.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vdeuda {

	@Id
	private String suministro;

	private String cedula;

	private String nombre;
	
	private String direccion;
	
	private BigDecimal mesSaldo;
	
	private BigDecimal deudaActual;
	
	private String canton;
	
	private String tarifa;

	public Vdeuda() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Vdeuda(String suministro, String cedula, String nombre, String direccion, BigDecimal mesSaldo,
			BigDecimal deudaActual, String canton, String tarifa) {
		super();
		this.suministro = suministro;
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.mesSaldo = mesSaldo;
		this.deudaActual = deudaActual;
		this.canton = canton;
		this.tarifa = tarifa;
	}



	public String getSuministro() {
		return suministro;
	}

	public void setSuministro(String suministro) {
		this.suministro = suministro;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public BigDecimal getMesSaldo() {
		return mesSaldo;
	}

	public void setMesSaldo(BigDecimal mesSaldo) {
		this.mesSaldo = mesSaldo;
	}

	public BigDecimal getDeudaActual() {
		return deudaActual;
	}

	public void setDeudaActual(BigDecimal deudaActual) {
		this.deudaActual = deudaActual;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
}
