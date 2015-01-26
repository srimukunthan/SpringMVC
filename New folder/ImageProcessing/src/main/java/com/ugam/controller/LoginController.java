package com.ugam.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ugam.model.PersonModel;
import com.ugam.service.PersonService;


@Controller
public class LoginController {
	
	private PersonService personService;
	
	@Autowired(required=true)
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}
	
	@RequestMapping(value = {"/login.htm","/"}, method = RequestMethod.GET)
	public String loginPage(Model model) {
		model.addAttribute("personModel", new PersonModel());
		return "login";
	}
	
	@RequestMapping(value = "/dashboard.html", method = RequestMethod.POST)
	public ModelAndView doLogin(@ModelAttribute PersonModel personModel, HttpSession session) {
		ModelAndView view = new ModelAndView("login");
		if(personService.authenticateUser(personModel)) {
				view.setViewName("welcome");
				session.setAttribute("uname" , personModel.getUserName());
				session.setAttribute("role" , personModel.getRole());
			}
			else{
				view.setViewName("login");
			}
		return view;
	}
	
	@RequestMapping(value = "/dashboard.html", method = RequestMethod.GET)
	public String sessionRedirect(HttpServletRequest request) {
		
		HttpServletRequest req = (HttpServletRequest) request;
        Object userName = req.getSession().getAttribute("uname");
		if(userName == null)
			return "login";
		else
			return "welcome";
	} 
	
	@RequestMapping(value = "/logout.htm")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "login";
	  }
}
