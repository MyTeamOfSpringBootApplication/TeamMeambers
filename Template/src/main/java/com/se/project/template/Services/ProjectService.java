package com.se.project.template.Services;

import com.se.project.template.Model.Projects;
import org.springframework.stereotype.Service;


public interface ProjectService {
    void saveProject(Projects project);

    Object findAll();

    Projects findProjectById(Long id);

    void deleteProjectById(Long id);
}
