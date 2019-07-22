package com.techelevator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

@Controller
public class ActorSearchController {
	
	// build a form 
	// request mapping reeuqestObject
	// exactly what we did with cityobject just with actor

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping(path = "/actorListResult", method = RequestMethod.GET)
	public String showActorSearchResults(@RequestParam(defaultValue = "") String lastName, ModelMap modelHolder) {
		lastName = lastName.toUpperCase();
		if (!lastName.equals("")) {
			modelHolder.put("actors", actorDao.getMatchingActors(lastName));
		}
		return "actorList";
	}
	
	/* What about here? */
	@RequestMapping(path = "/actorList", method = RequestMethod.GET)
	public String searchActors() {
		/* Call the model and pass values to the jsp */
		return "actorList";
	}
}

