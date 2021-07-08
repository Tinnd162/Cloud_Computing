package io.tinnd.lmsapp.services.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import io.tinnd.lmsapp.entities.Subject;
import io.tinnd.lmsapp.repositories.SubjectRepository;
import io.tinnd.lmsapp.services.SubjectService;

@Component
@Transactional
public class SubjectServiceImpl implements SubjectService {

    @PersistenceContext
    private EntityManager manager;

    // private List<Subject> subjects;

    @Autowired
    private SubjectRepository subjectRepo;

    @Override
    public List<Subject> findAll() {
        return subjectRepo.findAll();
    }

    // @Override
    // public List<Subject> getSubjectbyFaculty(String faculty) {
    //     subjects =manager.createNamedQuery("getSubjectbyFaculty", Subject.class).setParameter(1, faculty).getResultList();
    //     return subjects;
    // }

    // @Override
    // public void deleteSubjectbyId(String id) {
    //     Subject _subjects = manager.createNamedQuery("getSubjectbyID", Subject.class).setParameter(1, id).getSingleResult();
    //     subjectRepo.delete(_subjects);
    // }
}
