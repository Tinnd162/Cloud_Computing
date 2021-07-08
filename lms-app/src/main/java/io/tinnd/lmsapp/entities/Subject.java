package io.tinnd.lmsapp.entities;


import javax.persistence.*;


import lombok.*;

@Entity(name = "Subject")
@Table(name = "subject")
@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getSubjectbyFaculty",
        query = "SELECT * FROM subject, faculty WHERE faculty_id=faculty.id AND faculty.id=?",
        resultClass = Subject.class
    ),
    @NamedNativeQuery(
        name = "getSubjectbyID",
        query = "SELECT * FROM subject WHERE id=?",
        resultClass = Subject.class
    )
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String subname;

    @Column (name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculties;
    
}
