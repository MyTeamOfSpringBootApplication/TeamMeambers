package com.se.project.template.Controller;

import com.se.project.template.Model.Departments;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DepartmentController {
    @GetMapping("/department/register")
    public String getRegisterPage(Model model){
        model.addAttribute("department", new Departments());
        return "Department/departmentForm";
    }

}
