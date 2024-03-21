package com.sp.main;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Users;
import com.sp.resources.SpringConfig;
public class Main {

	public static void main(String[] args) {
		//ApplicationContext ap= new ClassPathXmlApplicationContext("/com/sp/resources/applicationContext.xml");
		ApplicationContext ap=new AnnotationConfigApplicationContext(SpringConfig.class);
		Users u=(Users) ap.getBean("stdId");
		System.out.print(u);
	}

}
