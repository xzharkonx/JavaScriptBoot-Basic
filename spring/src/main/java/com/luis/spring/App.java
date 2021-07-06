package com.luis.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luis.beans.AppConfig;
import com.luis.beans.AppConfig2;
import com.luis.beans.Estrella5;
import com.luis.beans.Mundo1;

/**
 * Hello world!
 *
 */
public class App {
	
	// Aquí haremos referencia a los archivos XML de Spring.
	
    public static void main( String[] args ){
    	
    	// En vez de hacer una instancia del Objeto Mundo, lo que haremos será utilizar ApplicacionContext
    	// Mundo1 mundo = new Mundo1(); // Así no.
    	
    	// Ejemplo con XML Beans.
    	// - Cargando el Bean desde XML.
    	// Si se encuentra en el mismo paquete, dejaríamos esto en blanco
    	// ApplicationContext appContext = new ClassPathXmlApplicationContext();
    	
    	// Si se encuentra en otro paquete, hacemos referencia a el archivo XML.    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/luis/xml/beans.xml");

    	
    	// Ejemplo con Anotaciones.
    	
    	// - Cargando el Bean desde Anotaciones.
    	// Solo se le pone la direccion si está en otro directorio o paquete.
    	// De esta forma podremos cargar los valores de las anotaciones y no de los XML.
    	
    	// - Crear un archivo de configuración Java de Beans (Revisar archivos AppConfig.java dentro de este paquete).
    	ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig2.class);        
    	
    	// -- Otro ejemplo para más de 2 archivos de anotaciones.
    	// ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class,AppConfig2.class);        
        
    	
    	// -- Otro ejemplo para ir agregando anotaciones de una en una.
    	// AnnotationConfigApplicationContext appContex = new AnnotationConfigApplicationContext();     
    	// appContex.register(AppConfig.class);
    	// appContex.register(AppConfig2.class);
    	// Reconstruimos el archivo de configuración con todos los archivos java que tienen las definiciones de los Beans.
    	// appContex.refresh(); 

    	
    	// - Cargamos el Bean del archivo XML haciendo referencia a la Clase.
    	// Mundo m = (Mundo) appContext.getBean(Mundo.class);
      
    	// - Cargamos el Bean del archivo XML haciendo referencia al apodo del id.
    	Mundo1 m = (Mundo1) appContext.getBean("mundo");
    	
    	// - Cargamos el Bean desde la anotación, haciendo referencia al nombre del Objeto creado.
    	Estrella5 e = (Estrella5) appContext2.getBean("luna");
      
    	System.out.println( m.getSaludo()+"\n"+e.getNombre());
       
    	// Liberamos los recursos
    	((ConfigurableApplicationContext)appContext).close();
    	((ConfigurableApplicationContext)appContext2).close();
    	
    }
}
