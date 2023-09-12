package com.Bharat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bharat.model.Employee;
import com.Bharat.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;

	@PostMapping("/saveData")
	public String saveData(@RequestBody Employee e) {

		hs.saveData(e);

		return "Data Saved";

	}
	@GetMapping("/getAllData")
	public List<Employee> getAllData()
	{
		List<Employee> list =hs.getAllData();
		
		return list;
		
	}
	

}
