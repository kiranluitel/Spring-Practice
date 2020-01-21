package firstpackage;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import customvalidationpackage.CourseCode;

public class Student {

	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String firstname;
	@Pattern(regexp="^(LUV).*",message="String should start with LUV")
	@NotNull(message="is required")
	private String lastname;
	private String country;
	private String sex;

	@Min(value=0,message="Value must be greater than or equal to 0")
	@Max(value=10,message="Value must be less than 11")
	@NotNull(message="is required")
	private Integer requiredNumber;
	private LinkedHashMap<String, String> sexOption;
	
public Integer getRequiredNumber() {
		return requiredNumber;
	}


	public void setRequiredNumber(Integer requiredNumber) {
		this.requiredNumber = requiredNumber;
	}


public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


public Student() {
		sexOption = new LinkedHashMap<>();
		sexOption.put("M", "Male");
		sexOption.put("FM", "Female");
		
		
	}
	
	
	public LinkedHashMap<String, String> getSexOption() {
		return sexOption;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
