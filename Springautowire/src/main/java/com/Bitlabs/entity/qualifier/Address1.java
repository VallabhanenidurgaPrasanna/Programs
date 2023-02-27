package com.Bitlabs.entity.qualifier;

public class Address1 {

		private String city;
		private String street;
		public Address1(String city, String street) {
			super();
			this.city = city;
			this.street = street;
		}
		public Address1() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Address1 [city=" + city + ", street=" + street + "]";
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		
		
	}


