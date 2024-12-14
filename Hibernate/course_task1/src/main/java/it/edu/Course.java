package it.edu;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private String courseId;
	private String title;
	private String provider;
	private int duration;
	private int fees;

	public Course(String courseId, String title, String provider, int duration, int fees) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.provider = provider;
		this.duration = duration;
		this.fees = fees;
	}

	public Course() {
		super();
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

}

/*
 * courseId (String) title (String) provider (String) e.g. Udemy, Edureka
 * duration (int) In terms of Hours fees (int)
 */
