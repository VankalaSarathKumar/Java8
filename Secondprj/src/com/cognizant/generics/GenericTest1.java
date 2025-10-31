package com.cognizant.generics;

class Employee{
    private int id;
    private String name;
    private String designation;
    public Employee(int id, String name, String designation) {
            super();
            this.id = id;
            this.name = name;
            this.designation = designation;
    }
    @Override
    public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
    }
    
    
}
public class GenericTest1 {
    public static void main(String[] args) {
            Pair<String> p1=new Pair<>("hello", "world");
            System.out.println(p1);
            Pair<Integer> p2=new Pair<>(12, 56);
            System.out.println(p2.getFirst()+p2.getSecond());
            Pair<Double> p3=new Pair<>(34.22,90.56);
            System.out.println(p3.getFirst()+p3.getSecond());
            Pair<Employee> p4=new Pair<>(new Employee(1001, "Rajiv", "Developer"), 
                            new Employee(4005, "Akash", "IT-Admin"));
            System.out.println(p4);
            
    }

}



