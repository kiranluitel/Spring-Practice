package firstpackage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class FormController {

	@RequestMapping("/show-form")
	public String showForm() {
		
		
		return "form";
	}
	
	@RequestMapping("/processForm")
	public String submittedForm(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		name = "Yo! " +name ;
		model.addAttribute("name", name);
		return "submittedform";
	}
	
	@RequestMapping("/processForm2")
	public String submittedForm2(@RequestParam("studentName") String name, Model model) {
		
		
		name = name.toUpperCase();
		name = "Second! " +name ;
		model.addAttribute("name", name);
		return "submittedform";
	}
}

