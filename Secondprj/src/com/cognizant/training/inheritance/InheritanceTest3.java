package com.cognizant.training.inheritance;

class Address{
    private String location;
    private String city;
    public Address(String location, String city) {
            this.location = location;
            this.city = city;
    }
    
    public void print() {
            System.out.println("Location:"+location);
            System.out.println("City:"+city);
    }
}

class Person{
    private String name;
    private String gender;
    private int age;
    private Address address;
    public Person(String name, String gender, int age, Address address) {
            
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.address = address;
    }
    
    public void print() {
            System.out.println("Name:"+name);
            System.out.println("Gender:"+gender);
            System.out.println("Age:"+age);
            System.out.println("Address");
            address.print();
    }
    
}
class Employee extends Person{
    private int empId;

    public Employee(String name, String gender, int age, Address address, int empId) {
            super(name, gender, age, address);
            this.empId = empId;
    }
    public void print() {
            super.print();
            System.out.println("Employee Id:"+empId);
    }
    
}

class Manager extends Employee{
    private String location;

    public Manager(String name, String gender, int age, Address address, int empId, String location) {
            super(name, gender, age, address, empId);
            this.location = location;
    }
    public void print() {
            super.print();
            System.out.println("Location:"+location);
    }
    
}


public class InheritanceTest3 {
public static void main(String[] args) {
    Address address1=new Address("Hebbal", "Bangalore");
    Employee e1=new Employee("Arvind", "Male", 25, address1, 32551);
    Manager m1=new Manager("Surya", "Male", 35, new Address("Panjakutta", "Hyderabad"), 25523, "South Zone");
    
    
    e1.print();
    
    System.out.println("printing the manager");
    m1.print();
}
}
