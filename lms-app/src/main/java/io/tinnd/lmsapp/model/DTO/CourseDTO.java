package io.tinnd.lmsapp.model.DTO;

import java.time.LocalDate;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseDTO {

    public String course_id;

    public String name;

    public String title;

    public LocalDate start_sem;

    public LocalDate end_sem;
}