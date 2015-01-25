package com.ugam.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ugam.model.PersonModel;
import com.ugam.service.PersonService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Value("${msg}")
	private String msg;	
	
	private PersonService personService;
	
	@Autowired(required=true)
	public void setPersonService(PersonService ps){
		this.personService = ps;
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		
		
			personService.addPerson(new PersonModel("mukunth", "143", "admin"));
		
		
		model.addAttribute("serverTime",  msg);
		
		return "home";
	}
	
}
