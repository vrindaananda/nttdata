package com.nttdata.Httpcrud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class EmployeeHandler {
	
	 
	/*static HashMap<Integer,Employee> emp=getCountryIdMap();
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@ResponseBody
public void init()
{
		ArrayList<Employee> h=new ArrayList<Employee>();
		Employee e1=new Employee(1,"vrinda",23,50000);
		h.add(e1);
		employee.add(h);
		h=new ArrayList<Employee>(); 
		Employee e2=new Employee(2,"nanda",27,80000);
		h.add(e2);
		employee.add(h);
		h=new ArrayList<Employee>(); 
		Employee e3=new Employee(3,"sonu",23,78900);
		h.add(e3);
		employee.add(h);
		
		
		
}
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	@ResponseBody
	
		public String getemployees(@RequestParam Integer classID){
		return employee.get(classID-1).toString();
	}
		
	@RequestMapping(value="/employees",method=RequestMethod.DELETE)
	@ResponseBody
	
		public void delemployees(@RequestParam Integer classID){
		 employee.remove(classID-1);
		 
		 System.out.println(employee);
	}
	@RequestMapping(value="/employees",method=RequestMethod.PUT)
	@ResponseBody
	public void putemployees(@RequestParam Integer classID,@RequestParam Employee name ){
		if(classID>employee.size()-1)
		{
			ArrayList<Employee> n=new ArrayList<Employee>();
			
			
			n.add(name);
			employee.add(n);
		}
		else
		{
			employee.get(classID).add(name);
		}
		System.out.println(employee);
	}*/
	empservice service = new empservice();
	 
	@RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json")
	public List getCountries() {
		List list = service.getAllemp();
		return list;
	}
 
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.POST, headers = "Accept=application/json")
	public Employee getempById(@PathVariable int id) {
		return service.getemp(id);
	}
 
	
 
	@RequestMapping(value = "/employees", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Employee updateCountry(@RequestBody Employee e) {
		return service.updateemp(e);
 
	}
 
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteemp(@PathVariable("id") int id) {
		service.deleteCountry(id);
 
	} 
}
	

