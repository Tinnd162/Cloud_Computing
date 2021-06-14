package io.tinnd.lmsapp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import io.tinnd.lmsapp.entities.Faculty;

@Service
public interface FacultyService {
    public List<Faculty> findAll();
}
