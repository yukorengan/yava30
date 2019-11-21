package com.verdin.jsf.model;

public class RowInfo {
    private String desc;
    private String name;
    private String phone;

    public RowInfo(String desc, String name, String phone) {
        this.desc = desc;
        this.name = name;
        this.phone = phone;
    }

    public String getDesc() {
        return desc;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public static RowInfo forProjectModule(String projectModule) {
        return new RowInfo(projectModule, "", "");
    }

    public static RowInfo forEmployee(Employee e) {
        return new RowInfo(e.getRole(), e.getName(), e.getPhone());
    }
}