package com.verdin.jsf.model;

public class Employee {
	private long id;
    private String name;
    private String role;
    private String phone;
    private String project;
    private String phoneNumber;
    private String address;

    private Department dept;

    public Employee() {
    }
    
    public Employee(long id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Department getDepartment() {
        return dept;
    }

    public void setDepartment(Department dept) {
        this.dept = dept;
        dept.addEmployee(this);
    }
    
}