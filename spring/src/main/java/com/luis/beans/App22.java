package com.luis.beans;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App22 {

	public static void main(String[] args) {
		
		System.out.println("Ingresa el equipo del jugador");
		
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/Beans22.xml");
		
		Jugador22 jug = (Jugador22) appContext.getBean("Jugador22");
		
		switch(op)
		{
		case 1:
			jug.setEquipo(new Barcelona18());
			break;
		case 2:
			jug.setEquipo(new Juventus18());
			break;
		default:
			System.out.println("Opcion Incorrecta");
			
			break;
		}
		
		
		System.out.println(jug.getNombre()+" - "+jug.getEquipo().mostrarEquipo()+" - "+jug.getCamiseta().getNumero()+" - "+jug.getCamiseta().getMarca().getNombre());
		
		
		((ConfigurableApplicationContext)appContext).close();
	}

}
