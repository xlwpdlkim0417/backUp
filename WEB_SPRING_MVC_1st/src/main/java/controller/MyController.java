package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import dao.MemberDao;
import dto.LoginCheck;

@Controller
public class MyController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/move")
	public String move() {
		return "redirect:/";
	}

	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}

	@PostMapping("/login")
	public String login(LoginCheck loginCheck, Model model, String id, String pw, MemberDao memberDao) {		
		memberDao.selectForLogin(id, pw);
		model.addAttribute("loginCheck", loginCheck);		
		return "login";
	}
	
	@GetMapping("/list")
	public String list() {
		return "list";
	}
	
	

}