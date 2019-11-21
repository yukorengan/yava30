package com.verdin.jsf.model;

import java.util.ArrayList;
import java.util.List;

public enum DataGenerator {
    Instance;

    public List<Karyawan> getEmployees() {
        String[] deptArray = {"IT", "Admin", "Sales", "HR"};
        List<Karyawan> employees = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
        	Karyawan e = new Karyawan();
            e.setId(i);
            e.setName(RandomUtil.getFullName());
            e.setDept(RandomUtil.getAnyOf(deptArray));
            e.setPhoneNumber(RandomUtil.getInt(111, 999) +
                    "-" + RandomUtil.getInt(111, 999) +
                    "-" + RandomUtil.getInt(111, 999));
            employees.add(e);
        }
        return employees;
    }
}