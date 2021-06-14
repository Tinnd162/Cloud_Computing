package io.tinnd.lmsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.tinnd.lmsapp.entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, String> {
    
}
