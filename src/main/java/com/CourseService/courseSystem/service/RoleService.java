package com.CourseService.courseSystem.service;


import com.CourseService.courseSystem.entity.user.Role;
import com.CourseService.courseSystem.repository.RoleRepository;
import com.CourseService.courseSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class RoleService {

     RoleRepository roleRepository;
    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public Role findByRoleName(String name) {
        return roleRepository.findByRoleName(name);

    }
}
