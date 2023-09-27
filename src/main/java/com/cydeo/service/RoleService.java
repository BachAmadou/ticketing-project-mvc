package com.cydeo.service;

import com.cydeo.dto.RoleDTO;

import java.util.List;

public interface RoleService extends CrudService<RoleDTO, Long> {

    // USING GENERICS: the below code should be deleted, but Im keeping them in comment for review purposes.
    // once it is deleted, this interface will extend CrudService
//    RoleDTO save(RoleDTO role);
//    RoleDTO findById(Long id);
//    List<RoleDTO> findAll();
//    void delete(RoleDTO role);
//    void deleteById(Long id);
}
