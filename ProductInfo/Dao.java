package com.java.ProductInfo;

public interface Dao {

	public void insertMethod(Product p);
	public void viewAll();
	public void searchById(int eid);
	public void update(int eid,String name);
	public void delete(int eid);
}
