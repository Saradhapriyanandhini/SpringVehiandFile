package org.vehiclemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message", "welcome");
		return "welcome";
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String sayHelloAgain(@PathVariable("name") String name ,ModelMap model) {
		model.addAttribute("message", "welcome Again");
		model.addAttribute("user", name);
		return "welcome";
	}

}
