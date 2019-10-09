package com.se.project.template.Model;

import javax.persistence.*;

@Entity
public class employees {
    @Column(name = "employee_id")
    private long id;
    private String em_firstname;
    private String em_lastname;
    private String em_number;

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
}
