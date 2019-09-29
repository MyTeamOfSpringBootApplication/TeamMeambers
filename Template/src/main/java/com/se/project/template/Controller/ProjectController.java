package com.se.project.template.Controller;

import com.se.project.template.Model.Projects;
import com.se.project.template.Services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/project/register")
    public String getRegisterProject(Model model){
        model.addAttribute("project", new Projects());
        return "Project/projectForm";
    }

    @PostMapping("/project/register")
    public String register(@ModelAttribute Projects project){
        projectService.saveProject(project);
        return "redirect:/project/list";
    }

    @RequestMapping(path = {"project/list", "/project"})
    public String getProjectList(Model model){
        model.addAttribute("projects", projectService.findAll());
        return "Project/projectList";
    }

    @GetMapping("/project/edit/{id}")
    public String editProject(@PathVariable Long id, Model model){
        Projects project = projectService.findProjectById(id);
        model.addAttribute("project", project);
        return "Project/projectForm";
    }

    @PostMapping("project/delete/{id}")
    public String deleteProject(@PathVariable Long id){
        projectService.deleteProjectById(id);
        return "redirect:/project";
    }

}
