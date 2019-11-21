package com.verdin.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@ManagedBean
@RequestScoped
public class EmployeeBean {
    private List<Employee> employeeList = DataService.Instance.getEmployeeList();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public List<Department> getDepartmentList() {
        return EmployeeService.Instance.getDepartmentList();
    }

    public Employee getEmployeeById() {
        long id = extractId("empId");
        return EmployeeService.Instance.findEmployeeById(id);
    }

    public Department getDepartmentById() {
        long id = extractId("deptId");
        return EmployeeService.Instance.findDepartmentById(id);
    }

    public long extractId(String idVar) {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance()
                                                                      .getExternalContext()
                                                                      .getRequest();
        String deptId = request.getParameter(idVar);
        return Long.parseLong(deptId);
    }
    
}