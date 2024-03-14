package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.LoginRequest;
import service.GetMemberNumService;

@Controller
public class MyController {
	@Autowired
	private GetMemberNumService getMemberNumService;

	@GetMapping("/")
	public String root() {
		return "index";
	}

	@GetMapping("/hello")
//	요청에 대한 이름
	public String hello() {
//		메소드 이름은 상관 없음
		return "hello";
//		view의 이름
	}

	@GetMapping("/login")
	public String login() {
		return "inputForm";
	}

	@GetMapping("/result")
	public String result(LoginRequest loginRequest, Model model) {
		System.out.println(loginRequest.getId());
		System.out.println(loginRequest.getEmail());
		System.out.println(getMemberNumService.getNumRecords());
		return "result";
	}

//	@GetMapping("/result")
//	public String result(@RequestParam String id, String email) {
//		System.out.println(id);
//		System.out.println(email);
//		return "result";
//	}

//	@GetMapping("/result")
//	public String result(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String email = request.getParameter("email");
//		System.out.println(id);
//		System.out.println(email);
//		return "result";
//	}

	@GetMapping("/move")
	public String move() {
		return "redirect:/";
	}
}