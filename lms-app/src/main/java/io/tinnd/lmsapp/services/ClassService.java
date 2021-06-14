package io.tinnd.lmsapp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import io.tinnd.lmsapp.entities.Class;

@Service
public interface  ClassService {
    public List<Class> findAll();
    public List<Class> getMajorbyFaculty(String faculty_id);
}
