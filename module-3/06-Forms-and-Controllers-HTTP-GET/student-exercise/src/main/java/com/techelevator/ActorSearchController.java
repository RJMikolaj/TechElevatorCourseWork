package com.techelevator;

import java.util.List;
import java.util.Map;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActorSearchController {

	
	
	// build a form
	// request mapping reeuqestObject
	// exactly what we did with cityobject just with actor

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping(path = "/actorSearch", method = RequestMethod.GET)
	public String showSearchActorForm(ModelMap map) {
		List<Actor> actors = actorDao.getMatchingActors();
		
		map.addAttribute("actors", actors);

	
		return "actorList";
	}

	/* What about here? */
	@RequestMapping("/actorSearch")
	public String searchActors(/* What arguments go here to get parameters from the page? */) {
		/* Call the model and pass values to the jsp */
		return null;
	}
}
