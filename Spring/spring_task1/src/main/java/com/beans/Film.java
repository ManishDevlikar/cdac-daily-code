package com.beans;

public class Film {

	private String title;
	private String genre;
	private int releaseYear;
	private Director directedBy;
	
	public Film() {
		super();
	}

	public Film(String title, String genre, int releaseYear, Director directedBy) {
		super();
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.directedBy = directedBy;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Director getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(Director directedBy) {
		this.directedBy = directedBy;
	}

	@Override
	public String toString() {
		return "Film [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + ", directedBy="
				+ directedBy + "]";
	}
	
	
	
}
