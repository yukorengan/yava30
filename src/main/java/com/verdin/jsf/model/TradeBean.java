package com.verdin.jsf.model;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import java.util.Map;

@ManagedBean
@ViewScoped
public class TradeBean {
    private TreeNode rootNode;

    @PostConstruct
    public void init() {
        rootNode = new DefaultTreeNode(
                RowInfo.forProjectModule("Project Modules"), null);

        for (ProjectModule pm : DataService.Instance.getProjectModules()) {
            addNode(pm);
        }
    }

    private void addNode(ProjectModule pm) {
        TreeNode moduleNode = new DefaultTreeNode(
                RowInfo.forProjectModule(pm.getModuleName()), rootNode);
        moduleNode.setExpanded(true);

        for (Map.Entry<String, List<Employee>> entry : pm.getProjects().entrySet()) {
            TreeNode projectNode = new DefaultTreeNode(
                    RowInfo.forProjectModule(entry.getKey()), moduleNode);
            for (Employee employee : entry.getValue()) {
                new DefaultTreeNode(RowInfo.forEmployee(employee), projectNode);
            }
        }
    }

    public TreeNode getRootNode() {
        return rootNode;
    }
}