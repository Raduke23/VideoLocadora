package com.mycompany.videolocadora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.mycompany.videolocadora.service.HelloWorldServiceCPF;
import com.mycompany.videolocadora.service.HelloWorldServiceCPFImpl;
import com.mycompany.videolocadora.service.HelloWorldServiceImpl;
import com.mycompany.videolocadora.service.HelloWorldServiceName;


@Configuration
public class Config {
	@Bean
	@Description("Descrption")
	public HelloWorldServiceName hello(){
		return new HelloWorldServiceImpl();
		
	}
	@Bean
	public HelloWorldServiceCPFImpl  cpf(){
		return new HelloWorldServiceCPF();
	}
}
