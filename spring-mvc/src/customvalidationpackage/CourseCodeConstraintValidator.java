package customvalidationpackage;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements 
ConstraintValidator<CourseCode,String>{
	
	private String coursePrefix;

	
	public void initialize(CourseCode theCourseCode) {
		this.coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String stringFromForm, ConstraintValidatorContext 
			constrainValidatorContext) {
		if (stringFromForm != null) {
			if(stringFromForm.startsWith(coursePrefix)) return true;
			else return false;
		}
		return true;
		
	}

}
