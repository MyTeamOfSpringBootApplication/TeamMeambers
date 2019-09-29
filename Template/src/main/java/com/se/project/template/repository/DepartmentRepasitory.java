package com.se.project.template.repository;

import com.se.project.template.Model.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepasitory extends JpaRepository<Departments, Long> {

}
