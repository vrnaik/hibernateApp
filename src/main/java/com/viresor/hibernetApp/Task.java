package com.viresor.hibernetApp;

import javax.persistence.Entity;


/**
 * @author vikas
 *
 */
@Entity
public class Task extends Module{

	public Task() {
		// TODO Auto-generated constructor stub
	}
	
	
	private String taskName;
	
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	
}
