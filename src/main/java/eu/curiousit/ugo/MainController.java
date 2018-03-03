package eu.curiousit.ugo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import eu.curiousit.ugo.Equipment;
import eu.curiousit.ugo.EquipmentRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/equipment") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private EquipmentRepository equipmentRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String type, @RequestParam int quant
			, @RequestParam String color) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Equipment n = new Equipment();
		n.setType(type);
		n.setQuant(quant);
		n.setColor(color);
		equipmentRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Equipment> getAllUsers() {
		// This returns a JSON or XML with the users
		return equipmentRepository.findAll();
	}
}