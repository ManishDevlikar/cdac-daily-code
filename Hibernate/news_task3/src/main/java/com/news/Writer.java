package com.news;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Writer {
	@Id
	private String writerId;
	private String name;

	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
	private Collection<Article> articles;

	public Writer() {
		this.articles = new ArrayList<Article>();
	}

	public Writer(String writerId, String name, Collection<Article> articles) {
		super();
		this.writerId = writerId;
		this.name = name;
		this.articles = articles;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Article> getArticles() {
		return articles;
	}

	public void setArticles(Collection<Article> articles) {
		this.articles = articles;
	}

	public void setArticle(Article article) {
		getArticles().add(article);
	}

}

/*
 * writerId (String) name (String) Collection<Article> articles
 */