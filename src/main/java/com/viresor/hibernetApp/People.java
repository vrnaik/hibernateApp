package com.viresor.hibernetApp;

import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author vikas
 *
 */
@Entity
public class People {

	public People() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue
	int id;
	@Basic
	String name;
	@Basic
	int age;
	@Basic
	String occupation;
	@Embedded
	Address addr;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	

}
