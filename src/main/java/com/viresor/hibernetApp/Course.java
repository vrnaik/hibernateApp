package com.viresor.hibernetApp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	private int courseDuration;
	
	@OneToOne(mappedBy = "course", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private CourseDetail courseDetail;
	
	public CourseDetail getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

}
