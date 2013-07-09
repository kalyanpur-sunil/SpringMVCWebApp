package org.sunil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {

	@RequestMapping("/simple")
	public String simpleController(){
		return "simple";
	}
	
	@RequestMapping(value = "/multiple", method=RequestMethod.GET)
	public String multipleParams(@RequestParam int id, @RequestParam String name){
		System.out.println("Id : "+ id);
		System.out.println("String is : "+ name);
		return "simple";
	}
}
