package io.tinnd.lmsapp.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SemesterDTO {

    public String id;

    public String name;

    public String description;
    
    public String semester_id;

    public String subject_id;
}
