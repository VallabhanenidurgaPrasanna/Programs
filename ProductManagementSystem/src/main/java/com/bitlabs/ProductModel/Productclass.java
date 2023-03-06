package com.bitlabs.ProductModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productclass {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String brand;
	private String quality;
	private int price;
	private int rating;
	private String warranty;
	private String dateofmanufacture;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getDateofmanufacture() {
		return dateofmanufacture;
	}
	public void setDateofmanufacture(String dateofmanufacture) {
		this.dateofmanufacture = dateofmanufacture;
	}
	@Override
	public String toString() {
		return "Productclass [id=" + id + ", name=" + name + ", brand=" + brand + ", quality=" + quality + ", price="
				+ price + ", rating=" + rating + ", warranty=" + warranty + ", dateofmanufacture=" + dateofmanufacture
				+ "]";
	}
	public Productclass(int id, String name, String brand, String quality, int price, int rating, String warranty,
			String dateofmanufacture) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.quality = quality;
		this.price = price;
		this.rating = rating;
		this.warranty = warranty;
		this.dateofmanufacture = dateofmanufacture;
	}
	public Productclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}