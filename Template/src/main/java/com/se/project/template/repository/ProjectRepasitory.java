package com.se.project.template.repository;

import com.se.project.template.Model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepasitory extends JpaRepository<Projects, Long> {
}
