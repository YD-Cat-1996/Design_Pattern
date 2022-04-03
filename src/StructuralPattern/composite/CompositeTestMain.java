package StructuralPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTestMain {
    public static void main(String[] args) {
        Employee CEO=new Employee("John","CEO",30000);
        Employee headSales=new Employee("Robert","Head Sales",20000);
        Employee headMarketing=new Employee("Michel","Head Marketing",20000);

        Employee clerk1=new Employee("Laura","Marketing",10000);
        Employee clerk2=new Employee("Bos","Marketing",10000);

        Employee sales1=new Employee("Richard","Sales",10000);
        Employee sales2=new Employee("Rob","Sales",10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(sales1);
        headSales.add(sales2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
class Employee{
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates=new ArrayList<>();
    }

    public void add(Employee employee){
        this.subordinates.add(employee);
    }

    public void remove(Employee employee){
        this.subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}