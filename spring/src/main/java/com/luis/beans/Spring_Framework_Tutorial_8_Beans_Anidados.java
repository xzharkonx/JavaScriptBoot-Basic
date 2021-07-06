package com.luis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_Framework_Tutorial_8_Beans_Anidados {
	
	
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Spring_Framework_Tutorial_8_Beans_Anidados.xml");
		Persona7 per = (Persona7) appContext.getBean("persona7");
		//Persona7 per = (Persona7) appContext.getBean("persona");//Forma 1 de llamar al bean
		//Persona7 per = (Persona7) appContext.getBean("persona7Bean");//Forma 1 de llamar al bean
		
		String ciudades="";
		for(Ciudad c : per.getPais().getCiudad())
		{
			ciudades +="Ciudad: "+ c.getNombre()+"\n";
		}
		
		System.out.print("Id: "+ per.getId()+"\nNombre: "+per.getNombre()+
				"\nPaís: "+per.getPais().getNombre()+"\n"+ciudades+"\n");
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
