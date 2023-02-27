package com.Bitlabs.entity.Hibernate_Mapmany;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
@Id
private int id;
private String pname;

@ManyToMany(mappedBy="p")
private List<Employee> e;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public List<Employee> getE() {
	return e;
}

public void setE(List<Employee> e) {
	this.e = e;
}

@Override
public String toString() {
	return "Project [id=" + id + ", pname=" + pname + ", e=" + e + "]";
}

}
