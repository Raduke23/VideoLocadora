package com.mycompany.videolocadora.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mycompany.videolocadora.config.Config;
import com.mycompany.videolocadora.service.HelloWorldServiceCPF;
import com.mycompany.videolocadora.service.HelloWorldServiceName;

public class HelloWorldServiceMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		HelloWorldServiceName hello = context.getBean(HelloWorldServiceName.class);
		hello.sayHello("Ze");
				
		HelloWorldServiceCPF CPF = context.getBean(HelloWorldServiceCPF.class);
		CPF.sayCPF("39606634809");
		context.close();
	}

}
