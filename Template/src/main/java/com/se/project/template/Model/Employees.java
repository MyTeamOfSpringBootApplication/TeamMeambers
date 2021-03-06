package com.se.project.template.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employees {

    private long id;
    private String em_firstname;
    private String em_lastname;
    private String em_number;

    //mapping the relationship whith department
    private Departments department;

    private Set<Projects> projects;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEm_firstname() {
        return em_firstname;
    }

    public void setEm_firstname(String em_firstname) {
        this.em_firstname = em_firstname;
    }

    public String getEm_lastname() {
        return em_lastname;
    }

    public void setEm_lastname(String em_lastname) {
        this.em_lastname = em_lastname;
    }

    public String getEm_number() {
        return em_number;
    }

    public void setEm_number(String em_number) {
        this.em_number = em_number;
    }

    @ManyToOne
    @JoinColumn(name = "fk_department")
    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @ManyToMany
    @JoinTable(name = "works_on", joinColumns = @JoinColumn(name = "fk_employee"), inverseJoinColumns = @JoinColumn(name = "fk_project"))
    public Set<Projects> getProjects() {
        return projects;
    }

    public void setProjects(Set<Projects> projects) {
        this.projects = projects;
    }
}
