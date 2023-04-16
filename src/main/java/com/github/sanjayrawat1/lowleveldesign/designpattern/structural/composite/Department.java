package com.github.sanjayrawat1.lowleveldesign.designpattern.structural.composite;

import java.util.HashSet;
import java.util.Set;

/**
 * A department.
 *
 * @author Sanjay Singh Rawat
 */
public abstract class Department {

    protected Set<Department> subDepartments = new HashSet<>();

    protected abstract void printName();

    protected void addDepartment(Department department) {
        subDepartments.add(department);
    }

    protected void removeDepartment(Department department) {
        subDepartments.remove(department);
    }
}
