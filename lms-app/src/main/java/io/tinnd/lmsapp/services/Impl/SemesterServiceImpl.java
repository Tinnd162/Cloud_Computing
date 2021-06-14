package io.tinnd.lmsapp.services.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.tinnd.lmsapp.entities.Semester;
import io.tinnd.lmsapp.model.DTO.SemesterDTO;
import io.tinnd.lmsapp.repositories.SemesterRepository;
import io.tinnd.lmsapp.services.SemesterService;

@Component
public class SemesterServiceImpl implements SemesterService{

    @PersistenceContext
    private EntityManager manager;

    @Autowired
    SemesterRepository semesterRepo;

    @Override
    public List<Semester> findAll() {
        return semesterRepo.findAll();
    }

    @Override
    public Semester getSemesterbyId(String id) {
        Semester semester=manager.createNamedQuery("getSemesterbyId", Semester.class).setParameter(1, id).getSingleResult();
        return semester;
    }

    @Override
    public void deleteSemester(String id) {
        Semester sem = manager.createNamedQuery("getSemesterbyId", Semester.class).setParameter(1, id).getSingleResult();
        semesterRepo.delete(sem);
    }

    @Override
    public void updateSemester(String id, Semester req) {
        Semester semester =manager.createNamedQuery("getSemesterbyId", Semester.class).setParameter(1, id).getSingleResult();
        semester.setTitle(req.getTitle());
        semester.setStartsem(req.getStartsem());
        semester.setEndsem(req.getEndsem());
        semesterRepo.save(req);
    }

    @Override
    public void createSemester(Semester req) {
        semesterRepo.save(req);
    }

    @Override
    public List<SemesterDTO> getDetailSemester(String id) {
        return semesterRepo.getDetailSemester(id);
    }
}
