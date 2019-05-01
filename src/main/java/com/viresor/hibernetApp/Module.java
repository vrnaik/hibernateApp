package com.viresor.hibernetApp;

import javax.persistence.Entity;


/**
 * @author vikas
 *
 */
@Entity
public class Module extends Project {

	public Module() {
		// TODO Auto-generated constructor stub
	}

	
	private String moduleName;
	
	
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
}
