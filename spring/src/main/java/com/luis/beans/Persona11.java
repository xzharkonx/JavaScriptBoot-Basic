package com.luis.beans;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
public class Persona11 {
private int id;
private String nombre;
private String apodo;
private Pais11 pais;
private Ciudad11 ciudad;

//@PostConstruct
public void init() {
	System.out.println("Antes de iniciar el Bean");
}

//@PreDestroy
public void destroy() {
	System.out.println("Bean a punto de ser destruido");
}

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
public String getApodo() {
	return apodo;
}
public void setApodo(String apodo) {
	this.apodo = apodo;
}
public Pais11 getPais() {
	return pais;
}
public void setPais(Pais11 pais) {
	this.pais = pais;
}
public Ciudad11 getCiudad() {
	return ciudad;
}
public void setCiudad(Ciudad11 ciudad) {
	this.ciudad = ciudad;
}
}
