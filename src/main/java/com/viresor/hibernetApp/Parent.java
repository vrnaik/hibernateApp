package com.viresor.hibernetApp;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author vikas
 *
 */
@Entity
public class Parent {
//	{
//		System.out.println("this is parent initialization block");
////		System.out.println(a);  // cannot print a as its not yet initialized
//	}
	
	
	int pid ;
	String pname;
	String pwork;
	

	public Parent() {
		System.out.println("this is parent constructor");
		
	}
	@Id
	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getPwork() {
		return pwork;
	}


	public void setPwork(String pwork) {
		this.pwork = pwork;
	}

}
