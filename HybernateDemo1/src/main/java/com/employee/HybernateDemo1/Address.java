package com.employee.HybernateDemo1;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Student_address")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="sid")
private int id;
@Column(name="STREET")
private String Street;
@Column(name="CITY")
private String City;
@Column(name="is_open")
private boolean open;
@Column(name="Added_date")
@Temporal(TemporalType.DATE)
private Date add_date;
@Lob
private byte[] image;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public boolean isOpen() {
	return open;
}
public void setOpen(boolean open) {
	this.open = open;
}
public Date getAdd_date() {
	return add_date;
}
public void setAdd_date(Date add_date) {
	this.add_date = add_date;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String street, String city, boolean open, Date add_date, byte[] image) {
	super();
	Street = street;
	City = city;
	this.open = open;
	this.add_date = add_date;
	this.image = image;
}

}
