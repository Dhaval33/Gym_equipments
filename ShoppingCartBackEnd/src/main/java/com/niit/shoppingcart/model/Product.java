package com.niit.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



@Entity
@Table(name= "product")
@Component

public class Product implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	//@Column(name="name")- This is necessary when the database tables name is different form the product ID
	private String name;
	
	private float price;
	
	private String category_id;
	
	private String supplier_id;
	
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID",nullable=false, updatable=false,insertable=false)
	private Category category;
	
	
	@ManyToOne
	@JoinColumn(name="SUPPLIER_ID",nullable=false, updatable=false,insertable=false)
	private Supplier supplier;
	
	@Transient
	private MultipartFile image;
	
	
	

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
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
    
	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
    public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	
	

}
