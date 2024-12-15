package com.utilities;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.news.Article;
import com.news.Writer;

public class ArticleSessionFactoryUtility {
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		Properties properties = new Properties();

		properties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/articles");
		properties.put("hibernate.connection.username", "root");
		properties.put("hibernate.connection.password", "root5003");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");

		configuration.addProperties(properties);
		configuration.addAnnotatedClass(Article.class);
		configuration.addAnnotatedClass(Writer.class);

		return configuration.buildSessionFactory();
	}
}
