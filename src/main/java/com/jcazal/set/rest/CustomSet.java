package com.jcazal.set.rest;

public class CustomSet {
	private String ruc;
	private int dv;
	private String razon_social;
	private String tipo;

	
	
	public CustomSet(String ruc, int dv, String razon_social, String tipo) {
		super();
		this.ruc = ruc;
		this.dv = dv;
		this.razon_social = razon_social;
		this.tipo = tipo;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public int getDv() {
		return dv;
	}

	public void setDv(int dv) {
		this.dv = dv;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
