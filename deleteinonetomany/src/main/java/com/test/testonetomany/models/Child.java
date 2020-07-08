package com.test.testonetomany.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Child {
	
	@Id
	private int cid;
	private String cname;
	
	
	public Child() {
		super();
	}
	public Child(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Child [cid=" + cid + ", cname=" + cname + "]";
	}
	

}
