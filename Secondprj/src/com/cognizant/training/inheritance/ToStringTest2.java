package com.cognizant.training.inheritance;

class Emp{
    private int id;
    private String name;
    private String designation;
    
    
    public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
    }


    public Emp(int id, String name, String designation) {
            super();
            this.id = id;
            this.name = name;
            this.designation = designation;
    }
    
    
}

public class ToStringTest2 {
public static void main(String[] args) {
    Emp emp=new Emp(1001, "Rajiv", "Accountant");
    System.out.println(emp);
}
}
