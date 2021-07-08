package io.tinnd.lmsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.tinnd.lmsapp.entities.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, String> {
    
}
