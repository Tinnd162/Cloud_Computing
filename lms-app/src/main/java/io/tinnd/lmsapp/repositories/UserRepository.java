package io.tinnd.lmsapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import io.tinnd.lmsapp.entities.User;
import io.tinnd.lmsapp.model.DTO.CourseDTO;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    @Query(nativeQuery = true, name = "getDetailStudent")
    public List<CourseDTO> getDetailSemester(String id);
}