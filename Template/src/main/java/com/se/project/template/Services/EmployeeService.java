package com.se.project.template.Services;

import com.se.project.template.Model.Employees;

public interface EmployeeService {


    void saveEmployee(Employees employee);

    Object findAll();

    Employees findEmployeeById(Long id);

    void deleteEmployeeById(Long id);
}
