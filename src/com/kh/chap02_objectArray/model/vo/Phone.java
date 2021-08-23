package com.kh.chap02_objectArray.model.vo;

public class Phone {

	// �̸�, �귣���, ����, �ø���
	private String name;
	private String brand;
	private int price;
	private String series;
	
	// �⺻������
	public Phone() {
		
	}
	
	// �Ű����� ������
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
		return "�̸�: " + name + ", �귣���: " + brand + ", ����: " + price + ", �ø���: " + series;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}