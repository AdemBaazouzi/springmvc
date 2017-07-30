package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	String message = "Bienvenu dans mon premier exemple de spring mvc";


@RequestMapping("/hello")
	public ModelAndView afficherMessager(@RequestParam(value="nom",defaultValue="World") String nom){
		ModelAndView  modelAndView=new ModelAndView("Hello World");
		modelAndView.addAllObjects("nom",nom);
		modelAndView.addAllObjects("message"message);
		return modelAndView;
	}

}
