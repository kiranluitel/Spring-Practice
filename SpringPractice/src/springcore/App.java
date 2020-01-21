package springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("application"
        		+ "Context.xml");
        CricketCoach myCoach = context.getBean("cricketCoach",CricketCoach.class);
        
        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getEmail());
        System.out.println(myCoach.getTeam());
        
        
       
        
       
        context.close();
    }
    
    
}
