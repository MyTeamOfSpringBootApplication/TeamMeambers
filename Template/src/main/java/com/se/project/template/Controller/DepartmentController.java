package com.se.project.template.Controller;

import com.se.project.template.Model.Departments;
import com.se.project.template.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/department/register")
    public String getRegisterPage(Model model){
        model.addAttribute("department", new Departments());
        return "Department/departmentForm";
    }
    @PostMapping("/department/register")
    public String registere(@ModelAttribute Departments department){
        departmentService.saveDepartment(department);
        return "redirect:/department/list";
    }

    @RequestMapping(path = {"/department/list", "/department"})
    public String getDepartmentlist(Model model){
        model.addAttribute("departments", departmentService.findAll());
        return "Department/departmentList";
    }

    @GetMapping("/department/edit/{id}")
    public String editDepartment(@PathVariable Long id, Model model){
        Departments department = departmentService.findDepartmentById(id);
        model.addAttribute("department", department);
        return "Department/departmentForm";
    }
    @PostMapping("department/delete/{id}")
    public String deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartmentById(id);
        return "redirect:/department";
    }






}
