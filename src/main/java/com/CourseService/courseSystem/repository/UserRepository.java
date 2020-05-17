package com.CourseService.courseSystem.repository;


import com.CourseService.courseSystem.entity.user.Role;
import com.CourseService.courseSystem.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByRole(Role role);
}
