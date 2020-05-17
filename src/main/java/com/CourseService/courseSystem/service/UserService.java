package com.CourseService.courseSystem.service;


import com.CourseService.courseSystem.entity.user.Role;
import com.CourseService.courseSystem.entity.user.User;
import com.CourseService.courseSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public List<User> findByRole(Role role) {
        return userRepository.findByRole(role);
    }

    public User getUser(Long id) {
        return userRepository.getOne(id);
    }
}
