package com.test.testonetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.testonetomany.models.Parent;
import com.test.testonetomany.repository.Childrepo;
import com.test.testonetomany.repository.Parentrepo;

@RestController
public class Controllerclass {
	
	@Autowired
	private Parentrepo parentrepo;
	@Autowired
	private Childrepo childrepo;
	
	@PostMapping("/post")
	public Parent postdata(@RequestBody Parent p)
	{
		return parentrepo.save(p);
	}
	
	@GetMapping("/get")
	public List<Parent> getdata()
	{
		return parentrepo.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletedata(@PathVariable int id)
	{
		parentrepo.deleteById(id);
		return ("deleted"+id);
	}
	
	
	
	

}
