package com.niit.shoppingcart.model;











import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Entity
@Table(name= "category")
@Component

public class Category {
	
	@Id
	private String id;
	
	//@Column(name="name")- This is necessary when the database tables name is different form the category ID
	private String name;
	
	private String description;
	
	@OneToMany(mappedBy="category", fetch= FetchType.EAGER)
	public Set<Product> products;
	
	
	
	
	
	
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}