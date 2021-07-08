package io.tinnd.lmsapp.model.DTO;

import java.time.LocalDate;

import io.tinnd.lmsapp.entities.Class;
import io.tinnd.lmsapp.entities.Faculty;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    public String id;

    public String firstname;

    public String lastname;

    public String middlename;

    public String phone;

    public boolean sex;

    public LocalDate dob;

    public String mail;

    public Class classes;
    
    public Faculty faculty;
}
