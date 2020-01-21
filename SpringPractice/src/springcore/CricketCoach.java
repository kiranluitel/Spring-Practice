package springcore;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}


	public void setEmail(String email) {
		System.out.println("inside cricket coach set email");
	
		this.email = email;
	}


	public void setTeam(String team) {
		System.out.println("inside cricket coach set team");
		this.team = team;
	}


	public String getEmail() {
		
		return email;
	}


	public String getTeam() {
		
		return team;
	}


	public CricketCoach() {
		System.out.println("Inside no-arg constructor");
	}
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method of CricketCoach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	//init-method
    public void myInitMethod() {
    	System.out.println("Inside init method");
    }
    //destroy-method
    public void myDestroyMethod() {
    	System.out.println("Inside destroy method");
    }

}
