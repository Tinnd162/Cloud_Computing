package io.tinnd.lmsapp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import io.tinnd.lmsapp.entities.Role;

@Service
public interface RoleService {
    public List<Role> findAll();
}
