package com.verdin.jsf.model;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
//import java.time.LocalTime;
import java.util.List;

@ManagedBean
@ViewScoped
//@RequestScoped
public class KaryawanBean {
    private List<Karyawan> employeeList;

    @PostConstruct
    private void postConstruct() {
        employeeList = DataGenerator.Instance.getEmployees();
    }

    public List<Karyawan> getEmployeeList() {
        return employeeList;
    }
}