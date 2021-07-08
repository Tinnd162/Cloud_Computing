package io.tinnd.lmsapp.services.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import io.tinnd.lmsapp.entities.Class;
import io.tinnd.lmsapp.repositories.ClassRepository;
import io.tinnd.lmsapp.services.ClassService;

@Component
@Transactional
public class ClassServiceImpl implements ClassService{

    @PersistenceContext
    private EntityManager manager;

    @Autowired
    ClassRepository classRepo;

    private List<Class> classes;

    @Override
    public List<Class> findAll() {
        return classRepo.findAll();
    }

    @Override
    public List<Class> getMajorbyFaculty(String faculty_id) {
        classes=manager.createNamedQuery("getMajorbyFaculty", Class.class).setParameter(1, faculty_id).getResultList();
        return classes;
    }    
}
