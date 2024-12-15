package com.models;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.news.Article;
import com.news.Writer;
import com.utilities.ArticleSessionFactoryUtility;

public class Model {
	public static void saveWriter(Writer writer) {
		try (SessionFactory factory = ArticleSessionFactoryUtility.getSessionFactory();
				Session session = factory.openSession()) {
			Transaction beginTransaction = session.beginTransaction();
			session.persist(writer);
			beginTransaction.commit();
			System.out.println("Saved");
		}
	}

	public static void saveArticle(Article article) {
		try (SessionFactory factory = ArticleSessionFactoryUtility.getSessionFactory();
				Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.persist(article);
			transaction.commit();
		}
	}

	public static List<Writer> getAllDetailList() {
		try (SessionFactory factory = ArticleSessionFactoryUtility.getSessionFactory();
				Session session = factory.openSession()) {
			Query<Writer> query = session.createQuery("from writer", Writer.class);
			return query.list();
		}
	}

	public static Collection<Article> getAllArticles() {
		try (SessionFactory factory = ArticleSessionFactoryUtility.getSessionFactory();
				Session session = factory.openSession()) {
			Query<Article> query = session.createQuery("from Article", Article.class);
			return query.list();
		}
	}

	public static void addArticles(String writerId, Collection<Article> articles) {
		try (SessionFactory factory = ArticleSessionFactoryUtility.getSessionFactory();
				Session session = factory.openSession()) {
			Writer writer = session.find(Writer.class, writerId);

			if (writer != null) {
				Transaction transaction = session.beginTransaction();
				writer.setArticles(articles);
				session.merge(writer);
				transaction.commit();
			} else {
				System.out.println("Writer not found");
			}
		}
	}

}
