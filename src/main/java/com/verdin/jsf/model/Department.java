package com.verdin.jsf.model;


import java.util.ArrayList;
import java.util.List;

public class Department {
    private long id;
    private String name;
    private List<Employee> employeeList = new ArrayList<>();

    public Department(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    void addEmployee(Employee employee){
        employeeList.add(employee);
    }
}