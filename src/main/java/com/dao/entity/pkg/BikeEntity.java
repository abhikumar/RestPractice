package com.dao.entity.pkg;

public class BikeEntity {
	private String id;
	private String name;
	private String color;
	private String email;
	private int price;
	
	
	public BikeEntity(){
		
	};
	
	public BikeEntity(String id, String name, String color, String email, int price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.email = email;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", color=" + color + ", email=" + email + ", price=" + price + "]";
	}
	
	
}
