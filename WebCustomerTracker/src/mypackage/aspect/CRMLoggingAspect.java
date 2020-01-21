package mypackage.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* mypackage.base.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* mypackage.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* mypackage.dao.*.*(..))")
	private void forDAOPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
	private void forAppFlow() {}
	
	@Before("forAppFlow()")
	private void loggerForBefore(JoinPoint joinPoint) {
		
		String signature = joinPoint.getSignature().toShortString();
		myLogger.info("====>LoggerForBefore gives signatures: "+signature);
		
		
	}
	

}
