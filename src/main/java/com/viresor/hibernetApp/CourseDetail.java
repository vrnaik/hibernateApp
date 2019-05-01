package com.viresor.hibernetApp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CourseDetail {
	@Id
	@GeneratedValue
	private int courseDetatilId;

	private String instructor;

	private int fees;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "fkey")
	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getCourseDetatilId() {
		return courseDetatilId;
	}

	public void setCourseDetatilId(int courseDetatilId) {
		this.courseDetatilId = courseDetatilId;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

}
