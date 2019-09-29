package com.se.project.template.Services;

import com.se.project.template.Model.Projects;
import com.se.project.template.repository.ProjectRepasitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImp implements ProjectService {
    @Autowired
    private ProjectRepasitory projectRepasitory;
    @Override
    public void saveProject(Projects project) {
        projectRepasitory.save(project);
    }

    @Override
    public Object findAll() {
        return projectRepasitory.findAll();
    }

    @Override
    public Projects findProjectById(Long id) {
        return projectRepasitory.getOne(id);
    }

    @Override
    public void deleteProjectById(Long id) {
        projectRepasitory.deleteById(id);
    }
}
