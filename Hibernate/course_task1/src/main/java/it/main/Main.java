package it.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import it.edu.Course;
import it.utilities.SessionFactoryUtility;

public class Main {
	public static void main(String[] args) {
		try (SessionFactory factory = SessionFactoryUtility.getSessionFactory();
				Session session = factory.openSession()) {

			Course course = new Course("cs2", "JAVA", "Udemy", 7, 390);

			Transaction beginTransaction = session.beginTransaction();
			session.persist(course);
			beginTransaction.commit();

		}
	}
}
