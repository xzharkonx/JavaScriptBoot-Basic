package com.luis.beans;

import org.springframework.beans.factory.annotation.Value;

public class Estrella5 {

	// Valor por default mediante el uso de anotaciones.
	// Sin que el archivo XML sea necesario.
	@Value("Luis Eduardo")
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
