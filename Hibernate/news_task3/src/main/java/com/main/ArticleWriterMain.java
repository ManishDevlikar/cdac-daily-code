package com.main;

import com.models.Model;

//import com.models.Model;
//import com.news.Writer;

//import com.models.Model;
//import com.news.Article;

public class ArticleWriterMain {
	public static void main(String[] args) {
//		Article article = new Article("a2", "python", "python is oop language", LocalDate.now());
//		Model.saveArticle(article);

//		Writer writer = new Writer("w2", "manish", null);
//		Model.saveWriter(writer);

		Model.addArticles("w1", Model.getAllArticles());
		System.out.println("created");

	}
}
