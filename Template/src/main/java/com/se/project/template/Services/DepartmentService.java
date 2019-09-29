package com.se.project.template.Services;

import com.se.project.template.Model.Departments;

public interface DepartmentService {
    void saveDepartment(Departments department);

    Object findAll();

    Departments findDepartmentById(Long id);

    void deleteDepartmentById(Long id);
}
