package com.luis.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luis.interfaces.IEquipo18;

public class Spring_Framework_Tutorial_18_Uso_de_interfaces {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Spring_Framework_Tutorial_18_Uso_de_interfaces.xml");
		
		Jugador18 jug = (Jugador18) appContext.getBean("messi");
		Barcelona18 bar = (Barcelona18) appContext.getBean("barcelona");
		Juventus18 juv = (Juventus18) appContext.getBean("juventus");
		
		// IEquipo equipo =  appContext.containsBean("juventus");
		// Tira error, se cambia por boolean para el casteo

		// Para comprobar que exista ese bean
		boolean equipo =  appContext.containsBean("juventus");
		// boolean equipo =  appContext.containsBean("barcelona");
		
		// Invocación desde la interfaz
		IEquipo18 iEquipo = (IEquipo18)  appContext.getBean("juventus");
		
		// Comprobando que exista la interfaz.
		System.out.println(equipo); // true
		
		// Mostrando los métodos implementados de Juventus en la interfaz.
		System.out.println(iEquipo.mostrarEquipo()); // Juventus
		
		// Desde la instancia de Jugador cargará la implementación del XML que se hizo con Barcelona
		// esto se podría cambiar para que implemente la Interfaz de Juventus cambiando la referencia
		// desde el archivo XML.
		System.out.println(jug.getNombre()+" - "+ jug.getEquipo().mostrarEquipo());
		
		
		// 1 de los 2, ya que hace referencia a 1 u a otro
		System.out.println(jug.getNombre()+" - "+bar.mostrarEquipo() +" - "+ juv.mostrarEquipo());
		
		
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
