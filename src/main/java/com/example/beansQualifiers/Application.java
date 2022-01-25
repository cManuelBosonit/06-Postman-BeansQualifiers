package com.example.beansQualifiers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	@Bean("bean1")
	public Persona Person1(){
		Persona persona1 = new Persona();
		persona1.setName("bean1");
		return persona1;
	}
	@Bean ("bean2")
	public Persona Person2(){
		Persona persona2 = new Persona();
		persona2.setName("bean2");
		return persona2;
	}
	@Bean("bean3")
	public Persona Person3(){
		Persona persona3 = new Persona();
		persona3.setName("bean3");
		return persona3;
	}

}
