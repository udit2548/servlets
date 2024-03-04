package com.tutorial.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		Alien obj= context.getBean(Alien.class); // DI(we are injecting alien bean here, using
		// getBean into this obj)
		obj.coding();
		
//		Laptop lap = context.getBean(Laptop.class);
//		lap.compile();
//		Cpu cp = context.getBean(Cpu.class);
//		cp.processing();
	}

}
