package mypackage.base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mypackage.dao.MyDAO;

public class App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
								new AnnotationConfigApplicationContext(JavaConfig.class);
		
		MyDAO myDAO = context.getBean("myDAO",MyDAO.class);
		
		myDAO.messageDAO();
		
		context.close();
	}

}
