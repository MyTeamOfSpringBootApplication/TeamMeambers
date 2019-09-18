package com.se.project.template.Controller;

import com.se.project.template.Model.employees;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class employeeController {

    @GetMapping("/employee/register")
    public String getRegisterPage(Model model){
        model.addAttribute("employee", new employees());
        return "Employee/employeeForm";
    }

}