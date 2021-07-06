package com.luis.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Mundo1 mundo () {
		return new Mundo1();
	}

}
