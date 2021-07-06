package com.luis.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LuisBeanPostProcessor implements BeanPostProcessor {

	//Se ejecuta antes de la inicialización
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Se ejecuta antes de la inicialización "+ beanName);
		return null;
	}

	//Se ejecuta antes de la finalización
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Se ejecuta antes de la finalización "+ beanName);
		return null;
	}

}
