package com.ejercicio7.apiEjercicio7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ejercicio7.apiEjercicio7.controller.ClienteController;
import com.ejercicio7.apiEjercicio7.controller.ReservaController;




@SpringBootApplication
@ComponentScan(basePackageClasses = ReservaController.class )
@ComponentScan(basePackageClasses = ClienteController.class )
public class ApiEjercicio7Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiEjercicio7Application.class, args);
	}

}
