package com.test.testone.dto;

import com.test.testone.models.Costumer;

public class GetC {
	
	private Costumer costumer;

	public Costumer getCostumer() {
		return costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	@Override
	public String toString() {
		return "GetC [costumer=" + costumer + "]";
	}

	public GetC(Costumer costumer) {
		this.costumer = costumer;
	}

	public GetC() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
