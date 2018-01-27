package ua.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class CostumerController {

	@RequestMapping("/")
	public String login(Model model){	
		return "index";
	}
	
}
