package com.nttdata.Employee;

import java.util.List;
import java.util.Set;

public class employee {
private int id;
private String name;
private int age;
private double salary;
private List address;

public List getAddress() {
	return address;
}


public void setAddress(List address) {
	this.address = address;
}


public employee(int id, String name, int age, double salary, List address) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.address = address;
}


public employee()
{
	
}


public void display() {
	System.out.println( "employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", address=" + address);
}


int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
