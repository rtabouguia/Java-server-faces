package fr.m2i.jsf.web.app;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "userData", eager = true)
public class UserData {

    private final List<Employee> employees = new ArrayList() {
        {
            add(new Employee("Anthony", "IT", 28, 3000.00));
            add(new Employee("John", "Marketing", 42, 3700.00));
            add(new Employee("Joe", "Sales", 21, 1800.00));
        }
    };

    private String name;
    private String department;
    private int age;
    private double salary;

    public String addEmployee() {

        Employee employee = new Employee(name, department, age, salary);
        employees.add(employee);

        return null;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
