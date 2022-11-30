package com.prowing.hibernate1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car1 {

@Id
@GeneratedValue(strategy = GenerationType.AUTO )
	int id;
	String car_name;
	String car_make;
	int car_price;
	public Car1(String car_name, String car_make, int car_price) {
		super();
		this.car_name = car_name;
		this.car_make = car_make;
		this.car_price = car_price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_make() {
		return car_make;
	}
	public void setCar_make(String car_make) {
		this.car_make = car_make;
	}
	public int getCar_price() {
		return car_price;
	}
	public void setCar_price(int car_price) {
		this.car_price = car_price;
	}
	@Override
	public String toString() {
		return "Car1 [ car_name=" + car_name + ", car_make=" + car_make + ", car_price=" + car_price
				+ "]";
	}
	
	

}
