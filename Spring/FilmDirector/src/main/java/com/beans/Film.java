package com.beans;

public class Film {

	public Film() {
		// TODO Auto-generated constructor stub
	}
	
	private String title;
	private String genre;
	private int releaseYear;
	private Director director;
	public Film(String title, String genre, int releaseYear, Director director) {
		super();
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.director = director;
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
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "Film [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + ", director=" + director
				+ "]";
	}
	
	

}
