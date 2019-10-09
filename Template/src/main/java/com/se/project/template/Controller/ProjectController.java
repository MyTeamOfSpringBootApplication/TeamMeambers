package com.se.project.template.Controller;

import com.se.project.template.Model.projects;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @GetMapping("/project/register")
    public String getRegisterProject(Model model){
        model.addAttribute("project", new projects());
        return "Project/projectForm";
    }

}
