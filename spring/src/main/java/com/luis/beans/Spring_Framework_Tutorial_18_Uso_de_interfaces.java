package com.luis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.luis.interfaces.IEquipo;
public class Spring_Framework_Tutorial_18_Uso_de_interfaces {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Spring_Framework_Tutorial_18_Uso_de_interfaces.xml");
		
		Jugador18 jug = (Jugador18) appContext.getBean("messi");
		Barcelona18 bar = (Barcelona18) appContext.getBean("barcelona");
		Juventus18 juv = (Juventus18) appContext.getBean("juventus");
		//IEquipo equipo =  appContext.containsBean("juventus");//Tira error, se cambia por boolean para el casteo
		boolean equipo =  appContext.containsBean("juventus");//Invocación desde la interfas
		//boolean equipo =  appContext.containsBean("barcelona");//1 de los 2, ya que hace referencia a 1 u a otro
		System.out.println(jug.getNombre()+" - "+bar.mostrarEquipo() +" - "+ juv.mostrarEquipo());
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
