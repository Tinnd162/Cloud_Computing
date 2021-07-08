package io.tinnd.lmsapp.entities;

import java.time.LocalDate;
import javax.persistence.*;
import io.tinnd.lmsapp.model.DTO.SemesterDTO;
import lombok.*;


@SqlResultSetMappings(
        value = {
                @SqlResultSetMapping(
                        name = "SemesterDTO",
                        classes = @ConstructorResult(
                                targetClass = SemesterDTO.class,
                                columns = {
                                        @ColumnResult(name = "id", type = String.class),
                                        @ColumnResult(name = "name", type = String.class),
                                        @ColumnResult(name = "description", type = String.class),                                       
                                        @ColumnResult(name = "semester_id", type = String.class),
                                        @ColumnResult(name = "subject_id", type = String.class)
                                }
                        )
                )
        }
)
@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getSemesterbyId",
        query = "SELECT * FROM semester where semester.id=?",
        resultClass = Semester.class
    ),
    @NamedNativeQuery(
        name = "getDetailSemester",
        resultSetMapping = "SemesterDTO",
        query = "SELECT course.id, course.name, course.description, course.semester_id, course.subject_id FROM course where course.semester_id=?"
    )
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "semester")
public class Semester {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name="title")
    private String title;

    @Column(name = "start_sem")
    private LocalDate startsem;
    
    @Column(name = "end_sem")
    private LocalDate endsem;
}
