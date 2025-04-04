package inventory.utilities;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import inventory.entity.Product;

public class SessionFactoryUtilites {
	public static SessionFactory getSeesionFactory() {
		Configuration conf = new Configuration();
		Properties prop = new Properties();
		prop.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/products");
		prop.put("hibernate.connection.username", "root");
		prop.put("hibernate.connection.password", "root5003");
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.hbm2ddl.auto", "update");

		conf.addProperties(prop);
		conf.addAnnotatedClass(Product.class);
		return conf.buildSessionFactory();
	}
}
