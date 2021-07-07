package com.luis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_Framework_Tutorial_7_Inyeccion_de_Objetos {

	public static void main(String[] args) {
		
		// Llamamos al archivo XML.
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Spring_Framework_Tutorial_7_Inyeccion_de_Objetos.xml");
		
		// Llamamos al Bean.
		Persona7 per = (Persona7) appContext.getBean("persona7");
		
		// Mostramos los resultados.
		System.out.println(per.getId()+" - "+per.getNombre()+" - "+per.getApodo() + " - " + per.getPais().getNombre() +
				" - " + per.getPais().getCiudad().getNombre());
		
		// Liberamos los recursos.
		((ConfigurableApplicationContext)appContext).close();
	}

}
