package com.employee.entity.Employe123;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe321 {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int eid;
private String name;
private int salary;
private String city;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employe321 [eid=" + eid + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
}
public Employe321(String name, int salary, String city) {
	super();
	this.name = name;
	this.salary = salary;
	this.city = city;
}
public Employe321() {
	super();
	// TODO Auto-generated constructor stub
}




}
