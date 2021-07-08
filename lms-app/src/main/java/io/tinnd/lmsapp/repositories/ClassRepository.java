package io.tinnd.lmsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.tinnd.lmsapp.entities.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class,String>{
    
}
