package com.luis.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig24 {

	@Bean
	public Jugador23 jugador23() {
		return new Jugador23();
	}
	
	@Bean
	public Barcelona21 barcelona21() {
		return new Barcelona21();
	}
	
	@Bean
	public Juventus21 juventus21() {
		return new Juventus21();
	}
	
	@Bean
	public Camiseta22 camiseta22() {
		return new Camiseta22();
	}
	
	@Bean
	public Marca22 marca22() {
		return new Marca22();
	}
}
