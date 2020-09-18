package walking.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	@GetMapping("/greet")
	public String greeting(@RequestParam(name="q", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("message", name);
		return "login";//Name of the view .html / .jsp
	}

}
