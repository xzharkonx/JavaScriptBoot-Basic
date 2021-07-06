package com.luis.beans;

import org.springframework.beans.factory.annotation.Required;//Librería para hacer requerido un campo

import com.luis.interfaces.IEquipo;
public class Jugador18 {
private int numero;
private String nombre;
private IEquipo equipo;
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
public IEquipo getEquipo() {
	return equipo;
}
@Required//Propiedad de Spring para hacer requerido un campo
public void setEquipo(IEquipo equipo) {
	this.equipo = equipo;
}
}
