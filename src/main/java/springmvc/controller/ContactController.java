package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.Users;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute Users user , Model model) {
		
		this.userService.createUser(user);
		
		System.out.println(user);
	
		return "sucess";
	}
	
	/*
	 * Handling form using @RequestParam
	 * 
	 *
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(
			//by default all the field are required @RequestParam(name="userEmail",required=true) String email
			@RequestParam("userEmail") String email,
			@RequestParam("userName") String name,
			@RequestParam("password") String password, Model model
			) {
			
			
	
		
		System.out.println(email);
		System.out.println(name);
		System.out.println(password);
		
		
		model.addAttribute("email", email);
		model.addAttribute("name", name);
		model.addAttribute("pass", password);
 
			
			
			Users user = new Users();
			user.setUserEmail(email);
			user.setUserName(name);
			user.setPassword(password);
			
			System.out.println(user);
			
			model.addAttribute("user", user);
	
		return "sucess";
	}
	*/
	

}
