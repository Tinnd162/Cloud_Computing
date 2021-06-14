package io.tinnd.lmsapp.services;

import java.util.List;
import org.springframework.stereotype.Service;

import io.tinnd.lmsapp.entities.User;
import io.tinnd.lmsapp.model.DTO.CourseDTO;
import io.tinnd.lmsapp.model.DTO.UserDTO;


@Service
public interface UserService {
    public List<UserDTO> findAll();

    public List<UserDTO> getUserbyFaculty_id(String faculty);
    
    public UserDTO getUserbyId(String id);
    
    public void deleteUser(String id);
    
    public List<UserDTO> getUserbyFacultyMajor(String faculty_id, String major_id);

    public User getCoursebyUser_id (String user_id);

    public List<CourseDTO> getDetailStudent (String id);
}
