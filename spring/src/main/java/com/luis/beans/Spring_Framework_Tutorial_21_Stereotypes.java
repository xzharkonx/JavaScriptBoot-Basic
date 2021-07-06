package com.luis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Spring_Framework_Tutorial_21_Stereotypes {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Spring_Framework_Tutorial_21_Stereotypes.xml");
		
		Jugador21 jug = (Jugador21) appContext.getBean("jugador21");//Si no estuviera definido nada
		//Jugador21 jug = (Jugador21) appContext.getBean("Messi");//Si se definiera un nombre en el component de Jugador21.java
		System.out.println(jug.getNombre()+" "+ jug.getBar().mostrarEquipo());
		((ConfigurableApplicationContext)appContext).close();
	}

}
