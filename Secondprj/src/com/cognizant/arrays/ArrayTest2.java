package com.cognizant.arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
            Employee[] employees=new Employee[3];
            employees[0]=new Employee(1323, "Rajiv", "Developer");
            employees[1]=new Employee(1327, "Arvind", "Accountant");
            employees[2]=new Manager(33434, "Suresh", "HR Manager", "Hyderabad");
            
            for(Employee e:employees) {
                    System.out.println(e);
            }
    }

}