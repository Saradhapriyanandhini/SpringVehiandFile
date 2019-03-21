package org.vehiclemanagement.controller;

//import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import org.vehiclemanagement.model.Brake;
//import org.vehiclemanagement.model.Parts;
import org.vehiclemanagement.model.User;
import org.vehiclemanagement.service.UserService;

@Controller
@RequestMapping("/user")
public class UserRegistrationController {

	@Autowired
	private UserService userService;
	@Autowired
	@Qualifier("passwordValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("user/home");
		return mv;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String initForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "user/register";
	}

	/*
	 * @RequestMapping(value = "/register", method = RequestMethod.GET) public
	 * String register(Map<String, Object> map) { map.put("user", new User());
	 * return "user/register"; }
	 */

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Map<String, Object> map) {
		map.put("user", new User());
		return "user/login";
	}

	/*
	 * @RequestMapping(value = "/view", method = RequestMethod.POST) public String
	 * view(User user,Map<String, Object> map) { //ModelAndView mv = new
	 * ModelAndView(); //String name=user.getUsername();
	 * 
	 * String name = userService.loginUser(user); if (name != null) {
	 * 
	 * //mv.addObject("message", "Welcome " + name +
	 * ", You have successfully logged in."); return "user/welcome";
	 * 
	 * } else {
	 * 
	 * //mv.addObject("message", "Invalid user id or password."); return
	 * "user/login"; }
	 * 
	 * }
	 */
	@RequestMapping(value = "/valid", method = RequestMethod.POST)
	public ModelAndView submitForm(Model model, @Validated User user, BindingResult result) {

		ModelAndView mv = new ModelAndView();
		// mv.setViewName("user/list");
		if (result.hasErrors()) {
			mv.setViewName("user/register");
			// return "redirect:/user/register/";
		} else {
			try {
				userService.create(user);
				/*
				 * if (mysql_errno() == 1062) { yatem.out.println("Duplicate"); }
				 */
			} catch (DataIntegrityViolationException e) {
				model.addAttribute("error", "Duplicate Entry");
				// mv.addObject("message", "Invalid user id or password.");

			}
			mv.setViewName("user/home");
		}
		return mv;
	}

	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public ModelAndView UserLogin(@ModelAttribute("user") User user) {

		ModelAndView mv = new ModelAndView();
		String name = userService.loginUser(user);
		// System.out.println(name);
		if (name != null) {
			// mv.addObject("message", "Welcome " + name + ", You have successfully logged
			// in.");
			mv.setViewName("user/home1");
		} else {
			mv.addObject("message", "Invalid user id or password.");
			mv.setViewName("user/login");
		}
		return mv;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView AddDetails() {
		ModelAndView mv = new ModelAndView("/user/add");
		// mv.addObject("msg", "Welcome");
		return mv;
	}

	@RequestMapping(value = "/view1", method = RequestMethod.POST)
	public ModelAndView viewDetails() {
		ModelAndView mv = new ModelAndView("/user/view1");
		mv.addObject("msg", "I'm view");
		return mv;
	}

	/*
	 * @RequestMapping(value = "/create", method = RequestMethod.GET) public String
	 * create(User user, Map<String, Object> map) {
	 * 
	 * userService.create(user);
	 * 
	 * return "redirect:/user/list/"; }
	 */
	@RequestMapping(value = "/brakeparts", method = RequestMethod.GET)
	public ModelAndView brakedetails() {
		ModelAndView mv = new ModelAndView("/user/brakeparts");
		// mv.addObject("msg", "I'm v);
		return mv;
	}

	@RequestMapping(value = "/mirrorparts", method = RequestMethod.GET)
	public ModelAndView mirrordetails() {
		ModelAndView mv = new ModelAndView("/user/mirrorparts");
		// mv.addObject("msg", "I'm v);
		return mv;
	}

	@RequestMapping(value = "/doorparts", method = RequestMethod.GET)
	public ModelAndView doordetails() {
		ModelAndView mv = new ModelAndView("/user/doorparts");
		// mv.addObject("msg", "I'm v);
		return mv;
	}

	@RequestMapping(value = "/steeringparts", method = RequestMethod.GET)
	public ModelAndView steeringdetails() {
		ModelAndView mv = new ModelAndView("/user/steeringparts");
		// mv.addObject("msg", "I'm v);
		return mv;
	}

	@RequestMapping(value = "/details/{userId}", method = RequestMethod.GET)
	public String details(@PathVariable("userId") Long userId, Map<String, Object> map) {
		User user = userService.find(userId);
		map.put("username", user.getUsername());
		map.put("password", user.getPassword());
		return "user/details";

	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Map<String, Object> map) {
		map.put("userList", userService.getAll());
		return "user/list";

	}
	
	@RequestMapping(value = "/brake", method = RequestMethod.POST)
	public ModelAndView addbrake( Brake brake) {

		ModelAndView mv = new ModelAndView();
		System.out.println("first");
		//userService.create1(brake);
		System.out.println("first1");
		mv.setViewName("user/view1");
		//return "redirect:/user/view11";
		return mv;
	}
	
	
}
