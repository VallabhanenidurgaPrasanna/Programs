package com.Dao;

public interface Dao {

	public void insert();
	public void viewAll();
	public void update(int eid,String name);
	public void searchById(int eid);
	public void deleteById(int eid);
	public void listOfRecordsDesc();
	public void listOfRecordsAsce();
	public void rangeOf();
	public void displaySalary();
	public void groupByCity();
}
