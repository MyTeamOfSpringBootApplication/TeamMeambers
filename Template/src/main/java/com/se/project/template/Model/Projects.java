package com.se.project.template.Model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
public class Projects {
    @Column(name = "project_id")
    private long id;
    private String pr_number;
    private double budget;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPr_number() {
        return pr_number;
    }

    public void setPr_number(String pr_number) {
        this.pr_number = pr_number;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
