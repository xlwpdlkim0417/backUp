package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("list", "List가 나올 페이지");
		return "list";
	}
}
