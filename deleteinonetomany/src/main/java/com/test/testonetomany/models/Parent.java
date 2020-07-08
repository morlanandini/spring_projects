package com.test.testonetomany.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Parent {
	
	@Id
	private int pid;
	private String pname;
	
	
	@OneToMany(targetEntity=Child.class,cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="cp_fk",referencedColumnName="pid")	
	private List<Child> child;


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public List<Child> getChild() {
		return child;
	}


	public void setChild(List<Child> child) {
		this.child = child;
	}
	
	

	
	
	
	
	
	
	
	

}
