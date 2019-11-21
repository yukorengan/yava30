package com.verdin.jsf.model;


import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;
import java.util.List;

public enum DataService {
    Instance;
    private String roles[] =
            {"Kaprodi", "Kajur", "Pegawai", "Dosen", "Tenaga Kerja Harian Lepas"};

    private DataFactory dataFactory = new DataFactory();
    private List<ProjectModule> modules = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();
    
    
    DataService() {
        //creating dummy projects
        addProject("Trading", "Real Time Trading", "Order System");
        addProject("Future/Option", "Option Analyzer", "Market Scanning System");
        addProject("Fixed Income", "Bond Tool", "Price/Yield Calculator",
                "Strategy Evaluator");
        employee();
    }

    private void employee() {
        //DataFactory dataFactory = new DataFactory();
        for (int i = 1; i < 100; i++) {
            Employee employee = new Employee();
            employee.setId(i);
            employee.setName(dataFactory.getName());
            employee.setPhoneNumber(String.format("%s-%s-%s", dataFactory.getNumberText(3),
                    dataFactory.getNumberText(3),
                    dataFactory.getNumberText(4)));
            employee.setAddress(dataFactory.getAddress() + "," + dataFactory.getCity());
            employeeList.add(employee);
        }
    }
    
     private void addProject(String module, String... projects) {
        ProjectModule pm = new ProjectModule();
        pm.setModuleName(module);
        for (String project : projects) {
            List<Employee> list = new ArrayList<>();
            for (String role : roles) {
                Employee e = new Employee();
                e.setProject(project);
                e.setRole(role);
                e.setName(dataFactory.getName());
                e.setPhone(String.format("%s-%s-%s", dataFactory.getNumberText(3),
                        dataFactory.getNumberText(3),
                        dataFactory.getNumberText(4)));
                list.add(e);

            }
            pm.addProject(project, list);
        }
        modules.add(pm);
    }

    public List<ProjectModule> getProjectModules() {
        return modules;
    }
    
    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}