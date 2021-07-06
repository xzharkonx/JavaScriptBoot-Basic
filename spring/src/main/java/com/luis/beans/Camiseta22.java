package com.luis.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camiseta22 {
private int id;
private int numero;
@Autowired
private Marca22 marca;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public Marca22 getMarca() {
	return marca;
}
public void setMarca(Marca22 marca) {
	this.marca = marca;
}
}
