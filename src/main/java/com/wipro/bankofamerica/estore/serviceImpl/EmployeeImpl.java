package com.wipro.bankofamerica.estore.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wipro.bankofamerica.estore.exception.EmployeeAlreadyPresentException;
import com.wipro.bankofamerica.estore.model.Employee;
import com.wipro.bankofamerica.estore.repository.EmployeeRepository;
import com.wipro.bankofamerica.estore.service.EmployeeService;

public class EmployeeImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository ;
	@Override
	public Employee saveEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployee(Integer id)
	{
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		else
		{
			throw new EmployeeAlreadyPresentException(" Employee is already Present ");
		}
		
	}

	@Override
	public void deleteEmployee(Integer id) 
	{
		Optional<Employee> optional = employeeRepository.findById(id);
		
		if(optional.isPresent())
		{
			employeeRepository.deleteById(id);
		}
		else
		{
			throw new EmployeeAlreadyPresentException(" Employee with id "+id+" not found ");
		}
		
	}

	
	

}
