package com.core.SpringCore;

public class Employee {
	
	private String name;
	private int age;
	private int id;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
	
	this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public void setId(int id)
	{
		 this.id=id;
	}
	
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ",id=" + id + ",]";
	}
	
	

}