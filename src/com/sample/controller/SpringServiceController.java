package com.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.sample.dao.StateService;
import com.sample.domain.City;


//controller class for handling request
@Controller
@RequestMapping("/state")
public class SpringServiceController {

	StateService stateService=new StateService();		
	
	//this method will accept stateId as parameter and will return list of cities for that state
	@RequestMapping(value = "/{stateId}", method = RequestMethod.GET)
	public ModelAndView fetchCities(@PathVariable("stateId") int stateId){
		List<City> cities = new ArrayList<City>();
		cities = stateService.getAllCities(stateId);					
		return new ModelAndView("citiesView","cities",cities);	
	} 	

}