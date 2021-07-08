package io.tinnd.lmsapp.services.Impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import io.tinnd.lmsapp.entities.User;
import io.tinnd.lmsapp.model.DTO.CourseDTO;
import io.tinnd.lmsapp.model.DTO.UserDTO;
import io.tinnd.lmsapp.model.mapper.UserMapper;
import io.tinnd.lmsapp.repositories.UserRepository;
import io.tinnd.lmsapp.services.UserService;

@Component
@Transactional
public class UserServiceImpl implements UserService {

    @PersistenceContext
    private EntityManager manager;

    private List<User> users;

    @Autowired
    private  UserRepository userRepo;
    
    @Override
    public List<UserDTO> findAll() {

        users= userRepo.findAll();
        ArrayList<UserDTO> result= new ArrayList<UserDTO>();
        for (User user: users)
        {
            result.add(UserMapper.toUserDTO(user));
        }
        return result;
    }

    @Override
    public UserDTO getUserbyId(String id) {

        User us = manager.createNamedQuery("getAllUserbyID", User.class).setParameter(1, id).getSingleResult();
        UserDTO result=UserMapper.toUserDTO(us);
        return result;
    }

    @Override
    public List<UserDTO> getUserbyFaculty_id(String faculty) {

        users = manager.createNamedQuery("getAllUserbyFaculty", User.class).setParameter(1, faculty).getResultList();
        ArrayList<UserDTO> result= new ArrayList<UserDTO>();
         for (User user: users)
        {
            result.add(UserMapper.toUserDTO(user));
        }
        return result;
    }

    @Override
    public void deleteUser(String id)
    {
        User _user = manager.createNamedQuery("getAllUserbyID", User.class).setParameter(1, id).getSingleResult();
        userRepo.delete(_user);
    }

    @Override
    public List<UserDTO> getUserbyFacultyMajor(String faculty_id, String major_id)
    {
        users = manager.createNamedQuery("getUserbyFacultyMajor", User.class).setParameter(1, faculty_id).setParameter(2, major_id).getResultList();
        ArrayList<UserDTO> result= new ArrayList<UserDTO>();
        for (User user: users)
       {
           result.add(UserMapper.toUserDTO(user));
       }
       return result;
    }

    @Override
    public User getCoursebyUser_id(String user_id) {
        User _user = manager.createNamedQuery("getCoursebyUser_id", User.class).setParameter(1, user_id).getSingleResult();
        return _user;
    }

    @Override
    public List<CourseDTO> getDetailStudent(String id) {
        return userRepo.getDetailSemester(id);
    }
}
