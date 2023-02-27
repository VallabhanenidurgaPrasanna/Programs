package com.Bitlabs.entity1;

public class Address {
private int id;
private String city;
private Employe1 emp;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Employe1 getEmp() {
	return emp;
}
public void setEmp(Employe1 emp) {
	this.emp = emp;
}
@Override
public String toString() {
	return "Address [id=" + id + ", city=" + city + ", emp=" + emp + "]";
}

}
