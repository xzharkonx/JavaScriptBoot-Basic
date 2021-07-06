package com.luis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_Framework_Tutorial_6_Inyeccion_por_Constructor {

	public static void main(String[] args) {

		// Llamamos al archivo XML.
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Spring_Framework_Tutorial_6_Inyeccion_por_Constructor.xml");
		
		// Llamamos al Bean.
		Persona6 per = (Persona6) appContext.getBean("persona6");
		
		// Mostramos los resultados.
		System.out.println(per.getId()+" - "+per.getNombre()+" - "+per.getApodo());
		
		// Liberamos los recursos.
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
