package com.example.EMS.repository;
import com.example.EMS.model.Project;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // No need to implement these methods here
    // Spring Data JPA will provide the implementation based on method signature
}
