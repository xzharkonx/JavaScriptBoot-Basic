package com.luis.beans;

import com.luis.interfaces.IEquipo18;
public class Jugador22 {

	private int id;
	private String nombre;
	private IEquipo18 equipo;
	private Camiseta22 camiseta;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo18 getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo18 equipo) {
		this.equipo = equipo;
	}
	public Camiseta22 getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta22 camiseta) {
		this.camiseta = camiseta;
	}
}
