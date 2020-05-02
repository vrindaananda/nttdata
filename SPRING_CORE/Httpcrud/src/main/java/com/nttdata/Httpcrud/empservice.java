package com.nttdata.Httpcrud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class empservice {
	static HashMap<Integer,Employee> emp=getEmployeeIdMap();
	 
	 
	public empservice() {
		super();
 
		if(emp==null)
		{
			emp=new HashMap<Integer,Employee>();
			
			Employee e1=new Employee(1,"vrinda",23,50000);
			Employee e2=new Employee(2,"nanda",23,45000);
			Employee e3=new Employee(3,"sonu",24,85000);
			
 
			emp.put(1,e1);
			emp.put(2,e2);
			emp.put(3,e3);
			
		}
	}
 
	public List getAllemp()
	{
		List countries = new ArrayList(emp.values());
		return countries;
	}
 
	public Employee getemp(int id)
	{
		Employee e= emp.get(id);
		return e;
	}
	public Employee addCountry(Employee e)
	{
		e.setId(getMaxId()+1);
		emp.put(e.getId(),e);
		return e;
	}
 
	public Employee updateemp(Employee e)
	{
		if(e.getId()<=0)
			return null;
		emp.put(e.getId(),e);
		return e;
 
	}
	public void deleteCountry(int id)
	{
		emp.remove(id);
	}
 
	public static HashMap<Integer, Employee> getEmployeeIdMap() {
		return emp;
	}
 
	// Utility method to get max id
	public static int getMaxId()
	{ int max=0;
	for (int id:emp.keySet()) { 
		if(max<=id)
			max=id;
 
	} 
	return max;
	}
}
