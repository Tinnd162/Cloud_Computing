package io.tinnd.lmsapp.entities;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.*;
// import org.hibernate.annotations.*
import org.springframework.stereotype.Component;

import io.tinnd.lmsapp.model.DTO.CourseDTO;
// import io.tinnd.lmsapp.util.StringPrefixedSequenceIdGenerator;
import lombok.*;

@SqlResultSetMappings(
        value = {
                @SqlResultSetMapping(
                        name = "CourseDTO",
                        classes = @ConstructorResult(
                                targetClass = CourseDTO.class,
                                columns = {
                                        @ColumnResult(name = "course_id", type = String.class),
                                        @ColumnResult(name = "name", type = String.class),                                       
                                        @ColumnResult(name = "title", type = String.class),                                       
                                        @ColumnResult(name = "start_sem", type = LocalDate.class),
                                        @ColumnResult(name = "end_sem", type = LocalDate.class)
                                }
                        )
                )
        }
)

@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getAllUserbyFaculty",
        query = "SELECT *  FROM user, faculty WHERE faculty.id= faculty_id AND faculty.id = ?",
        resultClass = User.class
    ),
    @NamedNativeQuery(
        name = "getAllUserbyID",
        query = "SELECT *  FROM user WHERE id = ?",
        resultClass = User.class
    ),
    @NamedNativeQuery(
        name = "getAllUserbyMajor",
        query = "SELECT *  FROM user, class WHERE class.id= class_id AND class.major = ?",
        resultClass = User.class
    ),
    @NamedNativeQuery(
        name = "getUserbyFacultyMajor",
        query = "SELECT * FROM user u, class c WHERE u.faculty_id=? AND u.class_id=? AND u.class_id=c.id",
        resultClass = User.class
    ),
    @NamedNativeQuery(
        name = "getCoursebyUser_id",
        query = "SELECT  * FROM user u INNER JOIN learns l ON u.id=l.user_id INNER JOIN course c ON l.course_id=c.id WHERE u.id=?",
        resultClass = User.class
    ),
    @NamedNativeQuery(
        name = "getDetailStudent",
        resultSetMapping = "CourseDTO",
        query = "SELECT learns.course_id, course.name, course.description, semester.title, semester.start_sem, semester.end_sem FROM course, learns, semester where learns.user_id=? and learns.course_id=course.id and semester.id=course.semester_id"
    )
})

@Entity(name = "User")
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@Data
@NoArgsConstructor
@Component
public class User {
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lms_sql")
    // @GenericGenerator(name="lms_sql", strategy = "io.tinnd.lmsapp.util.StringPrefixedSequenceIdGenerator", parameters ={
    //     @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
    //     @Parameter (name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "U_"),
    //     @Parameter(name =StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")
    // })
 
    @Id
    @Column(name = "id")
    private String id;

    public String findById (String id)
    {
        return id;
    }

    @Column(name = "first_name")
    private String firstname;

    @Column (name="last_name")
    private String lastname;
    
    @Column (name ="middle_name")
    private String middlename;

    @Column (name = "phone_no")
    private String phone;

    @Column (name = "sex")
    private Boolean sex;

    @Column (name = "dob")
    private LocalDate dob;

    @Column (name = "mail")
    private String mail;

    @Column (name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name="class_id", nullable = false)
    private Class classes;

    @ManyToOne
    @JoinColumn(name = "faculty_id", nullable = false)
    private Faculty faculties;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "learns", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;
}
