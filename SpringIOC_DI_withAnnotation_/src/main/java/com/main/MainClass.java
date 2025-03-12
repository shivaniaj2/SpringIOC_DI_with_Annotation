package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfigClass;
import com.entity.Register;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(MyConfigClass.class);
		Register R=context.getBean("R1",Register.class);
//		R.setId(1);
//		R.setName("Sunil");
//		R.setPass("Shiva@22");
		System.out.println(R);
	
		
	}

}
