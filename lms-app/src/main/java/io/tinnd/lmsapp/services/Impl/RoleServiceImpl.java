package io.tinnd.lmsapp.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.tinnd.lmsapp.entities.Role;
import io.tinnd.lmsapp.repositories.RoleReposiory;
import io.tinnd.lmsapp.services.RoleService;

@Component
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleReposiory roleRepo;

    @Override
    public List<Role> findAll() {
        return roleRepo.findAll();
    }
    
}
