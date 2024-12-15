package com.news;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Article {
	@Id
	private String articleId;
	private String subject;
	private String headLine;
	private LocalDate dateOfPublication;

	public Article(String articleId, String subject, String headLine, LocalDate dateOfPublication) {
		super();
		this.articleId = articleId;
		this.subject = subject;
		this.headLine = headLine;
		this.dateOfPublication = dateOfPublication;
	}

	public Article() {
		super();
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public LocalDate getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(LocalDate dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

}
/*
 * articleId (String) subject (String) headLine (String) dateOfPublication
 * (LocalDate)
 */