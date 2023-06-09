package com.Collection.Set;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    String jobRole;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(jobRole, employee.jobRole);
//        if(this.id==emp)

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, jobRole);
    }
}
