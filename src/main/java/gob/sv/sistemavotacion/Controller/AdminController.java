package gob.sv.sistemavotacion.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")

public class AdminController {
	@GetMapping("/acceder")
	public ModelAndView acceder() {
		return new ModelAndView ("Admin");
	}

}
