package com.viresor.hibernetApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * @author vikas
 *
 */

@Entity
@Inheritance(strategy=InheritanceType.JOINED)// there are three inheritance type Single Table(Default), Joinned Table , Table per Class
public class Project {

	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	private int projectId;
	private String projectName;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
	
	

}
