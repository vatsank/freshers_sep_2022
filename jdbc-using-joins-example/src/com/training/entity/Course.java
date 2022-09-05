package com.training.entity;

import java.time.LocalDate;
import java.util.Set;

public class Course {

	private int courseId;
	private String courseName;
	private LocalDate startDate;
	
	private Set<Participant> list;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, LocalDate startDate) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.startDate = startDate;
	}
	/**
	 * @return the courseId
	 */
	public int getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	/**
	 * @return the list
	 */
	public Set<Participant> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(Set<Participant> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", startDate=" + startDate + "]";
	}
	
	
	
}
