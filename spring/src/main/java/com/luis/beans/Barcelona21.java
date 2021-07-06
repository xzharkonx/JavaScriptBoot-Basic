package com.luis.beans;

import org.springframework.stereotype.Component;

import com.luis.interfaces.IEquipo21;

@Component
public class Barcelona21 implements IEquipo21{

	public String mostrarEquipo() {
		
		return "Barcelona FC";
	}

}
