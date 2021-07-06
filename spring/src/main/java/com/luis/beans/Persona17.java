package com.luis.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Persona17 implements InitializingBean, DisposableBean{
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Se ejecuta antes de la inicialización ");
		
	}

	public void destroy() throws Exception {
		System.out.println("Se ejecuta antes de la finalización ");
		
	}

	

}
