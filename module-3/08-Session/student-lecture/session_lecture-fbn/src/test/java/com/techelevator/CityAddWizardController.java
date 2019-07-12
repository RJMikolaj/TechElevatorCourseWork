package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/addCity")
public class CityAddWizardController {
	
	@RequestMapping(path="/stepOne", method=RequestMethod.GET)
	public String showStepOne() {
		return "wizard/addCityPart1";
	}
	

	

}
