package com.luis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring_Framework_Tutorial_11_Autowire {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Spring_Framework_Tutorial_11_Autowire.xml");
		
		Persona11 per = (Persona11) appContext.getBean("persona11");
		
		per.setId(1);
		per.setNombre("Luis");
		per.setApodo("zharkon1@hotmail.com");
		
		Persona11 per2 = (Persona11) appContext.getBean("persona11");
		per2.setId(2);
		per2.setNombre("Eduardo");
		per2.setApodo("xzharkonx@gmail.com");
		System.out.println(per.getNombre()+" "+per.getApodo()+" "+per.getPais().getNombre()+" "+per.getCiudad().getNombre());
		System.out.println(per2.getNombre()+" "+per2.getApodo()+" "+per2.getPais().getNombre()+" "+per2.getCiudad().getNombre());
		((ConfigurableApplicationContext)appContext).close();
	}

}
