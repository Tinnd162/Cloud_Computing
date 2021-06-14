package io.tinnd.lmsapp.entities;

import javax.persistence.*;
import lombok.*;

@Entity(name = "Class")
@Table(name = "class")

@NamedNativeQueries({
    @NamedNativeQuery(
        name = "getMajorbyFaculty",
        query = "SELECT * FROM class WHERE id_faculty=?",
        resultClass = Class.class
    )
})

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Class {
    @Id
    @Column(name = "id")
    private String id;

    @Column (name = "major")
    private String major;
    
    @Column (name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_faculty")
    private Faculty faculty;
}
