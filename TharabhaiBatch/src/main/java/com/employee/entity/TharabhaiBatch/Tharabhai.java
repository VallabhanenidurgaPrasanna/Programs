package com.employee.entity.TharabhaiBatch;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tharabhai {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="Student_id")
private int id;
@Column(name="Student_name")
private String name;
@Column(name="Student_email")
private String email;
@Column(name="Student_marks")
private int marks;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public Tharabhai(String name, String email, int marks) {
	super();
	this.name = name;
	this.email = email;
	this.marks = marks;
}
public Tharabhai() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Tharabhai [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
}
		
}
