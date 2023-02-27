package com.Bitlabs.entity.Hibernate_Mapmany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
private int id;
private String ename;

@ManyToMany
private List<Project> p;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public List<Project> getP() {
	return p;
}

public void setP(List<Project> p) {
	this.p = p;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", ename=" + ename + ", p=" + p + "]";
}


}
