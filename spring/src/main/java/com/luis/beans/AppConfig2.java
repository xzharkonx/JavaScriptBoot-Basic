package com.luis.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	@Bean
	public Estrella5 luna()
	{
		return new Estrella5();
	}
}
