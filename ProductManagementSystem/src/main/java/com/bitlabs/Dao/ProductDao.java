package com.bitlabs.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bitlabs.ProductModel.Productclass;

@Repository
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void addProduct(Productclass product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Productclass> getAll(){
		List<Productclass> list=new ArrayList();
		list=this.hibernateTemplate.loadAll(Productclass.class);
		return list;
		
	}
	
	
	public Productclass getProductById(int id) {
		Productclass pro=this.hibernateTemplate.get(Productclass.class,id);
		return pro;
	}
	
	@Transactional
	public void delete(int id) {
		Productclass product=this.hibernateTemplate.get(Productclass.class,id);
		this.hibernateTemplate.delete(product);
	}
}
