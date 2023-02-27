package com.Dao;

public interface DaoInterface {
	public void insert();
	public void getAllStudents();
	public void update(int id,String name);
	public void getById(int id);
    public void deleteById(int id);
}
