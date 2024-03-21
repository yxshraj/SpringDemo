package com.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sp.beans.Users;

@Configuration
public class SpringConfig {

	@Bean
	public Users stdId()
	{
		Users u=new Users()	;
		u.setName("yashraj");
		u.setId(101);
		u.setPassword("1234");
		return u;
	}
}
