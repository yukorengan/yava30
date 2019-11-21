package com.verdin.jsf.model;


import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum EmployeeService {
    Instance;
    private final List<Department> departmentList;
    private final List<Employee> employeeList = new ArrayList<>();

    EmployeeService() {
       departmentList = Arrays.asList(
                new Department(1, "HR"),
                new Department(2, "Admin"),
                new Department(3, "IT"),
                new Department(4, "Sales")
        );
        DataFactory dataFactory = new DataFactory();
        for (int i = 1; i < 20; i++) {
            Employee employee = new Employee(i);
            employee.setName(dataFactory.getName());
            employee.setPhone(String.format("%s-%s-%s", dataFactory.getNumberText(3),
                    dataFactory.getNumberText(3),
                    dataFactory.getNumberText(3)));
            employee.setAddress(dataFactory.getAddress() + ", " + dataFactory.getCity());
            employee.setDepartment(dataFactory.getItem(departmentList));
            employeeList.add(employee);
        }
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public Employee findEmployeeById(long id) {
        Optional<Employee> opt = employeeList.stream()
                                             .filter(e -> e.getId() == id)
                                             .findAny();
        return opt.isPresent() ? opt.get() : null;
    }

    public Department findDepartmentById(long id) {
        Optional<Department> opt = departmentList.stream()
                                                 .filter(d -> d.getId() == id)
                                                 .findAny();
        return opt.isPresent() ? opt.get() : null;
    }
}