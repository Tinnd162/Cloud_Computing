package io.tinnd.lmsapp.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.tinnd.lmsapp.entities.Faculty;
import io.tinnd.lmsapp.repositories.FacultyRepository;
import io.tinnd.lmsapp.services.FacultyService;

@Component
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    FacultyRepository facultyRepo;
    @Override
    public List<Faculty> findAll() {
        return facultyRepo.findAll();
    }
}
