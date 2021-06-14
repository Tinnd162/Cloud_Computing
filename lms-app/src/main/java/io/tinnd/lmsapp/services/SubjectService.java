package io.tinnd.lmsapp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import io.tinnd.lmsapp.entities.Subject;

@Service
public interface SubjectService {
    public List<Subject> findAll();

    // public List<Subject> getSubjectbyFaculty(String faculty);

    // public void deleteSubjectbyId(String id);
}
