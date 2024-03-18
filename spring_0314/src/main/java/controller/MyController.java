package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import dao.BoardDao;
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
	public String login(LoginCheck loginCheck, Model model) {
		model.addAttribute("loginCheck", loginCheck);
		return "login";
	}

	@GetMapping("/list")
	public String list(BoardDao boardDao) {
		boardDao.selectList(1, 10);
		return "list";
	}

}