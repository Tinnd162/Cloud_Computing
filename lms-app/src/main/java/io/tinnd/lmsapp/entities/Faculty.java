package io.tinnd.lmsapp.entities;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "faculty")
public class Faculty {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;
}