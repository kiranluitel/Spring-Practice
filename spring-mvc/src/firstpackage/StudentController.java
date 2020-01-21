package firstpackage;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/show-form")
	public String studentForm(Model model){
		Student theStudent = new Student();
		model.addAttribute("student",theStudent);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent, 
			BindingResult theBindingResult) {
		
		System.out.println("Lastname : |"+theStudent.getLastname()+"|");
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}
		else return "student-confirmation";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		var stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

}
