package com.luis.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luis.interfaces.IEquipo21;



@Component
public class Jugador23 {
	private int id;
	@Value("Lionel Messi")
	private String nombre;
	@Autowired
	@Qualifier("barcelona21")//El nombre se da por la clase pero se anota en minúsculas
	//@Qualifier("juventus21")//El nombre se da por la clase pero se anota en minúsculas
	private IEquipo21 equipo;
	
	@Autowired
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

	
	
	public IEquipo21 getEquipo() {
		return equipo;
	}

	public void setEquipo(IEquipo21 equipo) {
		this.equipo = equipo;
	}

	public Camiseta22 getCamiseta() {
		return camiseta;
	}

	public void setCamiseta(Camiseta22 camiseta) {
		this.camiseta = camiseta;
	}
	
}
