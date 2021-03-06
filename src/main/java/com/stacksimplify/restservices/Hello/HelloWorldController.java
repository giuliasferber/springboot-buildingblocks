package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/helloworldbean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Giulia", "SferBer", "Milan");
	}
}
