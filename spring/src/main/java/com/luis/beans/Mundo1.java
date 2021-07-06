package com.luis.beans;

//import org.springframework.beans.factory.annotation.Value;

public class Mundo1 {

//	@Value("Hola hola")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
//	Necesitamos definir este Objeto Mundo en un contenedor para que Spring lo pueda manejar.
//	Esto es conocido como el Spring Container.
	
//	Básicamente es un Archivo XML.
//	Crearemos un nuevo Folder en: Preferencias, Java Build Path, Seleccionaremos Add Folder 
//	y le daremos en crear nuevo folder al cual le colocaremos: main/resources
//	Mira que en la raís de nuestro proyecto nos habrá creado ese folder.
//	Dentro crearemos un nuevo paquete: com.luis.mxl
//	Ahí crearemos nuestros XML.
	
//	Creando XML
//	Le daremos en el paquete a: new, buscaremos con spring crear el archivo spring bean configuration file sts 4
//	Si no esta, entonces tenemos que hacer lo siguiente:
	
//	Help > Eclipse market
//	Type spring and search
//	Find Spring IDE Roo Support and click install
//	Accept terms and click finish
//	Restart STS
//	File > New > Others > Spring > Spring Bean configuration file
	
//	Más información : https://stackoverflow.com/questions/53187354/spring-spring-bean-configuration-file-option-is-missing-in-sts

//	Si existiera un confligto entonces hay que instalar versiones anterioes de la suite de spring.
//	O utilizar otra suite con las dependencias de Spring 3.
}
