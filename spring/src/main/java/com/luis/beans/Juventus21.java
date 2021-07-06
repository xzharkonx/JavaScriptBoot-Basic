package com.luis.beans;

import org.springframework.stereotype.Component;

import com.luis.interfaces.IEquipo21;

@Component
public class Juventus21 implements IEquipo21{

	public String mostrarEquipo() {
		
		return "Juventus";
	}

}
