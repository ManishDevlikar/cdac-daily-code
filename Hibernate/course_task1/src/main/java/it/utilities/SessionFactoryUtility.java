package it.utilities;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import it.edu.Course;

public class SessionFactoryUtility {
	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		Properties prop = new Properties();
		prop.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/course");
		prop.put("hibernate.connection.username", "root");
		prop.put("hibernate.connection.password", "root5003");
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.hbm2ddl.auto", "update");

		conf.setProperties(prop);
		conf.addAnnotatedClass(Course.class);
		return conf.buildSessionFactory();
	}
}
