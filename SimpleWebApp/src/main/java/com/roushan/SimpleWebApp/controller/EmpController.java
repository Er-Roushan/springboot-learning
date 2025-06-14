package com.roushan.SimpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roushan.SimpleWebApp.model.Emp;
import com.roushan.SimpleWebApp.service.EmpService;

@RestController
@RequestMapping("/usingh2db")
public class EmpController {

	@Autowired
	private EmpService empservice;
	
	@RequestMapping("")
	public String greetMsg(){
		return "Now we are using h2 database.";
	}
	
	@GetMapping("/emp")
	public List<Emp> getAllEmp(){
		return empservice.getAllEmployees();
	}
	
	@PostMapping("/addemp")
	public String add(@RequestBody Emp obj) {
		return empservice.addEmp(obj);
	}
}
