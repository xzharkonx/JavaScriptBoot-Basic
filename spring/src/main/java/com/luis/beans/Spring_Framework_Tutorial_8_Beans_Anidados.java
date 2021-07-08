package com.luis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_Framework_Tutorial_8_Beans_Anidados {
	
	
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Spring_Framework_Tutorial_8_Beans_Anidados.xml");
		
		// Tema 9. Referenciando Beans
		// Forma 1. referenciada de llamar a un bean mediante una etiqueta de Alias
		// Persona8 per = (Persona8) appContext.getBean("persona8Bean");
		
		// Forma 2.Referenciada mediante el tag name en el Ben 
		// Persona8 per = (Persona8) appContext.getBean("persona");

		// Forma normal de llamar al bean
		Persona8 per = (Persona8) appContext.getBean("persona8");
		
		String ciudades="";
		
		for(Ciudad7 c : per.getPais().getCiudad())
		{
			ciudades +="Ciudad: "+ c.getNombre()+"\n";
		}
		
		System.out.print("Id: "+ per.getId()+"\nNombre: "+per.getNombre()+
				"\nPaís: "+per.getPais().getNombre()+"\n"+ciudades+"\n");
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
