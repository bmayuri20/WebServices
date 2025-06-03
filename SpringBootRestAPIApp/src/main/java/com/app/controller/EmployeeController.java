package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

@RestController
public class EmployeeController {
	List<Employee> list= new ArrayList<>();
	
	@PostMapping("/employee")
	//@RequestMapping(value= "/employee", method = RequestMethod.POST)
	public Employee saveEmp(@RequestBody Employee e) {
		list.add(e);
		return e;
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployees(){
		return list;
	}
	@PutMapping("/employee/{empId}")
	public Employee updateEmp(@PathVariable("empId") int empId, @RequestBody Employee e) {
		e.setEmpId(empId);
		System.out.println("call"+ e.getEmpName());
		return e;
}
}
