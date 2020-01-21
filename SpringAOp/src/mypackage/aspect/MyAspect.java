package mypackage.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(public void messageDAO())")
	public void message() {
		System.out.println("Exectuing before advice of Aspect");
	}

}
