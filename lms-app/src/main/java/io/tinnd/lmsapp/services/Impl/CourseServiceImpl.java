package io.tinnd.lmsapp.services.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import io.tinnd.lmsapp.entities.Course;
import io.tinnd.lmsapp.model.DTO.MixUserDTO;
import io.tinnd.lmsapp.repositories.CourseRepository;
import io.tinnd.lmsapp.services.CourseService;

@Component
@Transactional
public class CourseServiceImpl implements CourseService{

    @PersistenceContext
    private EntityManager manager;

    @Autowired
    CourseRepository courseRepo;

    // private List<Course> courses;

    @Override
    public List<Course> findAll() {
        return courseRepo.findAll();
    }

    // @Override
    // public List<Course> getCourseinSemester(String semester) {
    //     courses=manager.createNamedQuery("getCouseinSemester", Course.class).setParameter(1, semester).getResultList();
    //     return courses;
    // }

    // @Override
    // public List<Course> getCoursebyFaculty(String faculty) {
    //     courses=manager.createNamedQuery("getCousebyFaculty", Course.class).setParameter(1, faculty).getResultList();
    //     return courses;
    // }

    // @Override
    // public List<Course> getCourseinSemesterbyFaculty(String semester, String faculty) {
    //     courses=manager.createNamedQuery("getCouseinSemesterbyFaculty", Course.class).setParameter(semester, faculty).getResultList();
    //     return courses;
    // }

	@Override
	public void deleteCourse(String id) {
        Course _course = manager.createNamedQuery("getCoursebyID", Course.class).setParameter(1, id).getSingleResult();
        courseRepo.delete(_course);
	}

    @Override
    public List<MixUserDTO> getDetailCourse(String id) {
        return courseRepo.getDetailCourse(id);
    }
}
