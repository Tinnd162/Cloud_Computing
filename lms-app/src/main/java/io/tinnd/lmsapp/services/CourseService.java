package io.tinnd.lmsapp.services;

import java.util.List;
import org.springframework.stereotype.Service;
import io.tinnd.lmsapp.entities.Course;
import io.tinnd.lmsapp.model.DTO.MixUserDTO;

@Service
public interface CourseService {
    public List<Course> findAll();

    // public List<Course> getCourseinSemester(String semester);

    // public List<Course> getCoursebyFaculty (String faculty);

    // public List<Course> getCourseinSemesterbyFaculty (String semester, String faculty);
    public void deleteCourse (String id);

    public List<MixUserDTO> getDetailCourse (String id);
}
