package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.HelloController;
import spring.MemberDao;

@Configuration
public class ControllerConfig {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public HelloController helloContoller() {
		return new HelloController();
	}
	
	

}
