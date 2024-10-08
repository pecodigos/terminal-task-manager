package com.pecodigos.task_manager.projects.services;

import com.pecodigos.task_manager.projects.dtos.ProjectDTO;
import com.pecodigos.task_manager.projects.models.Project;
import com.pecodigos.task_manager.users.models.User;

import java.util.List;
import java.util.Optional;

public interface ProjectServiceInterface {
    Optional<Project> getProjectById(Long id);
    List<Project> getAllProjects();
    Project saveProject(ProjectDTO projectDTO, User user);
    Project updateProject(Long id, ProjectDTO projectDTO);
    void deleteProject(Long id);
}
