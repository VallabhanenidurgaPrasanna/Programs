package com.Bitlabs.entity.SpringcoreDI;

public class Employes {
 
	private int id;
	private String name;
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
	@Override
	public String toString() {
		return "Employes [id=" + id + ", name=" + name + "]";
	}
	
}
