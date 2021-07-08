package io.tinnd.lmsapp.model.mapper;

import io.tinnd.lmsapp.entities.User;
import io.tinnd.lmsapp.model.DTO.UserDTO;

public class UserMapper {
    public static UserDTO toUserDTO(User user)
    {
        UserDTO tmp = new UserDTO();
        tmp.setId(user.getId());
        tmp.setFirstname(user.getFirstname());
        tmp.setLastname(user.getLastname());
        tmp.setMiddlename(user.getMiddlename());
        tmp.setPhone(user.getPhone());
        tmp.setSex(user.getSex());
        tmp.setDob(user.getDob());
        tmp.setMail(user.getMail());
        tmp.setClasses(user.getClasses());
        tmp.setFaculty(user.getFaculties());
        
        return tmp;
    }
}
