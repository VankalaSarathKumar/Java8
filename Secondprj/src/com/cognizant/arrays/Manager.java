package com.cognizant.arrays;

public class Manager extends Employee {
	private String location;

	public Manager(int id, String name, String designation, String location) {
		super(id, name, designation);
		this.location = location;
	}
	 @Override
     public String toString() {
             return "Manager ["+super.toString()+"  location ="+location+"]";

}

}
