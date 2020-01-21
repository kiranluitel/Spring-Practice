package springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(JavaConfig.class);
       CricketCoach myCoach = context.getBean("cricketCoach",CricketCoach.class);
        
        System.out.println(myCoach.getDailyWorkOut());
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getEmail());
        System.out.println(myCoach.getTeam());
        
        
       
        
       
        context.close();
    }
    
    
}
