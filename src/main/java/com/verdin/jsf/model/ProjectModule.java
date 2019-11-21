package com.verdin.jsf.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectModule {
    private String moduleName;
    private Map<String, List<Employee>> projects = new HashMap<>();

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Map<String, List<Employee>> getProjects() {
        return projects;
    }

    public void setProjects(Map<String, List<Employee>> projects) {
        this.projects = projects;
    }

    public void addProject(String project, List<Employee> list) {
        projects.put(project, list);
    }
}