package io.tinnd.lmsapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tinnd.lmsapp.entities.Course;
import io.tinnd.lmsapp.model.DTO.MixUserDTO;
import io.tinnd.lmsapp.services.CourseService;

@RestController
@RequestMapping("/courses")
@CrossOrigin
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("")
    public ResponseEntity<?> findAll()
    {
        List<Course> res= courseService.findAll();
        return ResponseEntity.ok(res);
    }

    // @GetMapping("/getbySemester/{semester}")
    // public ResponseEntity<?> getCourseinSemester(@PathVariable String semester)
    // {
    //     List<Course> res= courseService.getCourseinSemester(semester);
    //     return ResponseEntity.ok(res);
    // }

    // @GetMapping("/getbyFaculty/{faculty}")
    // public ResponseEntity<?> getCoursebyFaculty(@PathVariable String faculty)
    // {
    //     List<Course> res= courseService.getCoursebyFaculty(faculty);
    //     return ResponseEntity.ok(res);
    // }

    // @GetMapping("/{semester}/{faculty}")
    // public ResponseEntity<?> getCourseinSemesterbyFaculty(@PathVariable String semester,@PathVariable String faculty)
    // {
    //     List<Course> res= courseService.getCourseinSemesterbyFaculty(semester,faculty);
    //     return ResponseEntity.ok(res);
    // }
    @DeleteMapping("/delete/{course_id}")
    public ResponseEntity<?> deleteCoursebyId (@PathVariable String course_id)
    {
        courseService.deleteCourse(course_id);
        return ResponseEntity.ok("Xóa thành công");
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<?> getDetailStudent(@PathVariable String id)
    {
        List<MixUserDTO> res=courseService.getDetailCourse(id);
        return ResponseEntity.ok(res);
    }
}
