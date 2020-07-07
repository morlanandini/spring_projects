package com.test.testone.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;





@Entity
public class Costumer {
	@Id
	private int id;
	private int name;
	
@OneToMany(targetEntity=Product.class,cascade=CascadeType.ALL)
@JoinColumn(name="cp_fk",referencedColumnName="id")
	
	private List<Product> products;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Costumer(int id, int name, List<Product> products) {
		this.id = id;
		this.name = name;
		this.products = products;
	}
	public Costumer() {
		super();
	}
	@Override
	public String toString() {
		return "Costumer [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
	
	
	

}
