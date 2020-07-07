package com.test.testone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.testone.dto.GetC;
import com.test.testone.models.Costumer;
import com.test.testone.repository.Costumerrepo;
import com.test.testone.repository.Productrepo;

@RestController
public class Controllers {

	@Autowired
	private Costumerrepo cr;
	@Autowired
	private Productrepo pr;
	
	@PostMapping("/place")
	public Costumer placeOrder(@RequestBody GetC request)
	{
		return cr.save(request.getCostumer());
	}
	
	@GetMapping("/findall")
	public List<Costumer> find()
	{
		return cr.findAll();
	}
}
