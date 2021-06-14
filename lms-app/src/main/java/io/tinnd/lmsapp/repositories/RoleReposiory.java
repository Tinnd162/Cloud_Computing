package io.tinnd.lmsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.tinnd.lmsapp.entities.Role;

@Repository
public interface RoleReposiory extends JpaRepository<Role, String>{
    
}
