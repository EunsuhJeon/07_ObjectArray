package com.kh.chap02_objectArray.model.vo;

public class Phone {

	// 이름, 브랜드명, 가격, 시리즈
	private String name;
	private String brand;
	private int price;
	private String series;
	
	// 기본생성자
	public Phone() {
		
	}
	
	// 매개변수 생성자
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getSeries() {
		return series;
	}
	
	// information
	public String information() {
		return "이름: " + name + ", 브랜드명: " + brand + ", 가격: " + price + ", 시리즈: " + series;
	}
	
	public String toString() {
		return "이름: " + name + ", 브랜드명: " + brand + ", 가격: " + price + ", 시리즈: " + series;
	}
	
	
	
	
	
	
	
	
	
	
}
