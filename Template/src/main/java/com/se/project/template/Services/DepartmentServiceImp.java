package com.se.project.template.Services;

import com.se.project.template.Model.Departments;
import com.se.project.template.repository.DepartmentRepasitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    DepartmentRepasitory departmentRepasitory;
    @Override
    public void saveDepartment(Departments department) {
        departmentRepasitory.save(department);
    }

    @Override
    public Object findAll() {
        return departmentRepasitory.findAll();
    }

    @Override
    public Departments findDepartmentById(Long id) {
        return departmentRepasitory.getOne(id);
    }

    @Override
    public void deleteDepartmentById(Long id) {
        departmentRepasitory.deleteById(id);
    }
}
