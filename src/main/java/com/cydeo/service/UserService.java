package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService extends CrudService<UserDTO, String> {

    // USING GENERICS: the below code should be deleted, but Im keeping them in comment for review purposes.
    // once it is deleted, this interface will extend CrudService
//    UserDTO save(UserDTO user);
//    UserDTO findById(String username);
//    List<UserDTO> findAll();
//    void delete(UserDTO user);
//    void deleteById(String username);

}
