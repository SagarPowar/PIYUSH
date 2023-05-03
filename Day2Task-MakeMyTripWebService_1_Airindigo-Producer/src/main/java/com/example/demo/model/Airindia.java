package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Airindia {
private int id;
private String fromm;
private String too;
private String price;
private int date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFromm() {
	return fromm;
}
public void setFromm(String fromm) {
	this.fromm = fromm;
}
public String getToo() {
	return too;
}
public void setToo(String too) {
	this.too = too;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
}