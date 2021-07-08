package com.luis.beans;

// Librería para hacer requerido un campo.
import org.springframework.beans.factory.annotation.Required;

import com.luis.interfaces.IEquipo18;

public class Jugador18 {
	
	private int numero;
	private String nombre;
	private IEquipo18 equipo;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
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
	
	// Propiedad de Spring para hacer requerido un campo.
	// Solo disponible en esta ubicación donde se encuentra este método.
	@Required 
	public void setEquipo(IEquipo18 equipo) {
		this.equipo = equipo;
	}
}
