package com.hype.stockz.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

//Entity

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double Price;
	private int quantity;
	private String mfg;
	private String expiryDate;
	private String description;
	@javax.persistence.Transient
	private MultipartFile image;
	
	public Product() {}

	public Product(String name, double price, int quantity, String mfg, String expiryDate, String description) {
		super();
		this.name = name;
		Price = price;
		this.quantity = quantity;
		this.mfg = mfg;
		this.expiryDate = expiryDate;
		this.description = description;
	}

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

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMfg() {
		return mfg;
	}

	public void setMfg(String mfg) {
		this.mfg = mfg;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", Price=" + Price + ", quantity=" + quantity + ", mfg=" + mfg
				+ ", expiryDate=" + expiryDate + ", description=" + description + "]";
	}
	
	

}
