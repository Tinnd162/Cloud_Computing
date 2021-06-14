package io.tinnd.lmsapp.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import io.tinnd.lmsapp.entities.Semester;
import io.tinnd.lmsapp.model.DTO.SemesterDTO;

@Repository
public interface SemesterRepository extends JpaRepository<Semester, String>{
    @Query(nativeQuery = true, name = "getDetailSemester")
    public List<SemesterDTO> getDetailSemester(String id);
}
