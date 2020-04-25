package com.example.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentTab")
public class Student {
	
	@Id
	@Column(name = "Roll_num")
	private int rollNumber;
	@Column(name = "Name")
	private String name;
	@Column(name = "Qualif")
	private String qualification;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNumber, String name, String qualification) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.qualification = qualification;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", qualification=" + qualification + "]";
	}
	
	

}
