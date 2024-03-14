package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controller.MyController;
import dao.MemberDao;
import service.GetMemberNumService;

@Configuration
public class ControllerConfig {

	@Bean
	public MyController myController() {
		return new MyController();
	}

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public GetMemberNumService getMemberNumService() {
		return new GetMemberNumService();
	}

}