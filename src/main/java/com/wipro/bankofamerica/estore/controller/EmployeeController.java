package com.wipro.bankofamerica.estore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.model.Product;
import com.wipro.bankofamerica.estore.service.EmployeeService;

@RestController
@RequestMapping("Employee/")
public class EmployeeController {
	
	
	@Autowired
	public EmployeeService employeeservice;
	
	@PostMapping ("save")
	public ResponseEntity<Employee> saveEmployee( @RequestBody  Employee employee) {
		
		Employee saveEmployee = employeeservice.saveEmployee(employee);
		
		return ResponseEntity.ok(saveEmployee);
		 
	} 
	
	 @GetMapping("/{id}")
	    public ResponseEntity<?> getEmployee(@PathVariable Integer id) {
	        try {
	            Employee employee = employeeservice.getEmployee(id);
	            return ResponseEntity.ok(employee);
	        } catch (RuntimeException e) {
	            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body("Employee not found");
	        }
	    }

}
