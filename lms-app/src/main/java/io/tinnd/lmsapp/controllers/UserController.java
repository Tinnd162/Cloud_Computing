package io.tinnd.lmsapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import io.tinnd.lmsapp.entities.User;
import io.tinnd.lmsapp.model.DTO.CourseDTO;
import io.tinnd.lmsapp.model.DTO.UserDTO;
import io.tinnd.lmsapp.services.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> findAll() {
        List<UserDTO> res= userService.findAll();
        return ResponseEntity.ok(res);
    }

    @GetMapping("/getbyFaculty/{faculty}")
    public ResponseEntity<?> getAllUserbyFaculty(@PathVariable String faculty) {
        List<UserDTO> res= userService.getUserbyFaculty_id(faculty);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable String id ) {
        UserDTO res= userService.getUserbyId(id);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable String id)
    {
        userService.deleteUser(id);
        return ResponseEntity.ok("Xóa thành công");
    }

    @GetMapping(value = "{faculty_id}/{major_id}")
    public ResponseEntity<?> getUserbyFacultyMajor(@PathVariable String faculty_id, @PathVariable String major_id)
    {
        List<UserDTO> res= userService.getUserbyFacultyMajor(faculty_id, major_id);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/getCoursebyUser_id/{user_id}")
    public ResponseEntity<?> getCouesebyUser_id(@PathVariable String user_id)
    {
        User res=userService.getCoursebyUser_id(user_id);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?> getDetailStudent(@PathVariable String id)
    {
        List<CourseDTO> res=userService.getDetailStudent(id);
        return ResponseEntity.ok(res);
    }
}
