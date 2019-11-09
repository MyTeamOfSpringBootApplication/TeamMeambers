package com.se.project.template.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Departments {

    private long id;
    private String de_number;
    private String de_name;
    private String de_location;

    //Mapping the relationships with the employee table
    private Set<Employees> employees;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDe_number() {
        return de_number;
    }

    public void setDe_number(String de_number) {
        this.de_number = de_number;
    }

    public String getDe_name() {
        return de_name;
    }

    public void setDe_name(String de_name) {
        this.de_name = de_name;
    }

    public String getDe_location() {
        return de_location;
    }

    public void setDe_location(String de_location) {
        this.de_location = de_location;
    }

    @OneToMany(mappedBy = "department")
    public Set<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employees> employees) {
        this.employees = employees;
    }
}
