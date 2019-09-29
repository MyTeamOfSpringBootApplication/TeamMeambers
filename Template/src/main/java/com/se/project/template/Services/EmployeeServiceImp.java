package com.se.project.template.Services;

import com.se.project.template.Model.Employees;
import com.se.project.template.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employees employee) {
        employeeRepository.save(employee);

    }

    @Override
    public Object findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employees findEmployeeById(Long id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }


}
