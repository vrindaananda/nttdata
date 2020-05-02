package com.nttdata.Emp_json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
	
	 
		@RequestMapping(value = "/employees", method = RequestMethod.GET)
		public List getEmployee()
		{
			List list = new ArrayList();
			list=getallemp();
			return list;
		}
	 
	
		@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
		public Employee getId(@PathVariable int id)
		{
			List<Employee> list = new ArrayList();
			list=getallemp();
	 
			for (Employee employee: list) {
				if(employee.getId()==id)
					return employee;
			}
	 
			return null;
		}
	 	
		public List getallemp()
		{
			Employee e1=new Employee(1,"vrinda",23,50000);
			Employee e2=new Employee(2,"nanda",23,45000);
			Employee e3=new Employee(3,"sonu",24,85000);
			Employee e4=new Employee(4,"sham",28,100000);
	 
			List list = new ArrayList();
			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.add(e4);
			return list;
		}
	}

