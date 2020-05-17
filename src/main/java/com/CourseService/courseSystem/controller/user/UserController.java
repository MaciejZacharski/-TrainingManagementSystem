package com.CourseService.courseSystem.controller.user;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping(path = "/dashboard", method = RequestMethod.GET)
    public String userDashboard() {

        return "userDashboard";
    }
}
