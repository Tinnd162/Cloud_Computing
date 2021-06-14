package io.tinnd.lmsapp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import io.tinnd.lmsapp.entities.Semester;
import io.tinnd.lmsapp.model.DTO.SemesterDTO;

@Service
public interface SemesterService {

    public List<Semester> findAll();

    public Semester getSemesterbyId(String id);
    
    public void deleteSemester(String id);

    public void updateSemester(String id, Semester req);

    public void createSemester (Semester req);

    public List<SemesterDTO> getDetailSemester (String id);
}