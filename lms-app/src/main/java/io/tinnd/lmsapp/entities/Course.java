package io.tinnd.lmsapp.entities;

import java.util.*;
import javax.persistence.*;
import io.tinnd.lmsapp.model.DTO.MixUserDTO;
import lombok.*;

@SqlResultSetMappings(
        value = {
                @SqlResultSetMapping(
                        name = "MixUserDTO",
                        classes = @ConstructorResult(
                                targetClass = MixUserDTO.class,
                                columns = {
                                        @ColumnResult(name = "id", type = String.class),
                                        @ColumnResult(name = "first_name", type = String.class),
                                        @ColumnResult(name = "middle_name", type = String.class),         
                                        @ColumnResult(name = "last_name", type = String.class),                                                                     
                                        @ColumnResult(name = "mail", type = String.class),
                                        @ColumnResult(name = "major", type = String.class),
                                        @ColumnResult(name = "name", type = String.class)
                                }
                        )
                )
        }
)

@NamedNativeQueries({
    // @NamedNativeQuery(
    //     name = "getCouseinSemester",
    //     query = "SELECT * FROM course, semester WHERE semester_id=semester.id and semester.id=?",
    //     resultClass = Course.class
    // ),
    // @NamedNativeQuery(
    //     name = "getCousebyFaculty",
    //     query = "SELECT * FROM course c, subject s, faculty f WHERE c.subject_id=s.id and s.faculty_id=f.id and s.faculty_id=?",
    //     resultClass = Course.class
    // ),
    // @NamedNativeQuery(
    //     name = "getCouseinSemesterbyFaculty",
    //     query = "SELECT * " +
    //             "FROM semester se, course c, subject s, faculty f "+
    //             "WHERE c.semester_id=se.id and c.semester_id=?1 and c.subject_id=s.id and s.faculty_id=f.id and s.faculty_id=?2",
    //     resultClass = Course.class
    // ),
    @NamedNativeQuery(
        name = "getCoursebyID",
        query = "SELECT * FROM course WHERE id=?",
        resultClass = Course.class
    ),
    @NamedNativeQuery(
        name = "getDetailCourse",
        query = "SELECT user.id, user.first_name, user.middle_name, user.last_name, user.mail, class.major, faculty.name FROM user, learns, class, faculty WHERE learns.course_id=? and learns.user_id=user.id and class.id=user.class_id and faculty.id=user.faculty_id",
        resultSetMapping = "MixUserDTO"
    )
})

@Table(name = "course")
@Entity(name = "Course")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester semester;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "learns", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<User> users;
}
