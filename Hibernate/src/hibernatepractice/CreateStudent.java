package hibernatepractice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {
	
	public static void main(String[] args) {
		
	
	//create session factory
	SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
	
	//create session
	Session session = factory.getCurrentSession();
	
	try {
		Student theStudent = new Student("Kiran","Luitel","kluitel@mum.edu");
		session.beginTransaction();
		System.out.println("Save the Student");
		session.save(theStudent);
		session.getTransaction().commit();
		System.out.println("done");
		
		session = factory.getCurrentSession();
		session.beginTransaction();
		Student newStudent = session.get(Student.class, 2);
		session.getTransaction().commit();
		System.out.println(newStudent);
		
		session = factory.getCurrentSession();
		session.beginTransaction();
		List<Student> theStudents = session
				.createQuery("from Student s where s.id = 3")
						.getResultList();
			
		session.getTransaction().commit();
		System.out.println(theStudents);
		
	}
	finally {
		factory.close();
	}
	}

}
