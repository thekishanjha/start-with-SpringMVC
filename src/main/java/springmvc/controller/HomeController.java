package springmvc.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		System.out.println("this is home page");
		
		model.addAttribute("name", "Ankit Tiwari");
		List<String> frndList = new ArrayList<String>();
		frndList.add("Sumit");
		frndList.add("Divakar");
		frndList.add("Badal");
		frndList.add("Banti");
		model.addAttribute("f",frndList);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help page");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Vishakha");
		
		LocalDateTime time = LocalDateTime.now();
		modelAndView.addObject("time", time);
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
