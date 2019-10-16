package com.example.SpringContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringContextApplication {

	public static void main(String[] args) {
		
		/**
		 * Ao executar a aplicacao ele pega no properties qual profile esta ativo e chama os metodos referentes a este profile.
		 * Podemos usar para setar o ambiente apropriado de execucao (prod ou dev)
		 */
		
		ApplicationContext ctx = SpringApplication.run(SpringContextApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		controller.hello();
		
		VehicleComponent vehicleComponent = (VehicleComponent) ctx.getBean("vehicleComponent");
		vehicleComponent.service();
	}

}
