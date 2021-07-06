package com.luis.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//("Messi")
public class Jugador21 {

@Value("messi")
private String nombre;

@Autowired
//@Qualifier("barcelonaQualifier")
private Barcelona21 bar;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Barcelona21 getBar() {
	return bar;
}
public void setBar(Barcelona21 bar) {
	this.bar = bar;
}
}
