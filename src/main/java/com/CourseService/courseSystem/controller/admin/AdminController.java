package com.CourseService.courseSystem.controller.admin;


import com.CourseService.courseSystem.entity.course.Course;
import com.CourseService.courseSystem.service.CourseService;
import com.CourseService.courseSystem.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private UserService userService;

    private CourseService courseService;

    public AdminController(UserService userService, CourseService courseService) {
        this.userService = userService;
        this.courseService = courseService;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {

        return "adminDashboard";
    }

    @GetMapping("/addCourse")
    public String addCourse(Model model) {

        model.addAttribute("course", new Course());
        return "addCourse";
    }

    @PostMapping("confirmationPage")
    public String courseConfirmation(@ModelAttribute Course course, Model model) {


        courseService.save(course);

        return "courseConfirmationPage";
    }

    @GetMapping("/courseList")
    public String courseList(Model model) {

        List<Course> courseList = courseService.findAll();

        model.addAttribute("courseList", courseList);

        return "courseList";

    }
    @GetMapping("/delete")
    public String deleteCourse(@RequestParam Long id) {
        courseService.delete(id);
        return "redirect:/admin/courseList";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam Long id,
                       Model model) {

        model.addAttribute("course", courseService.findById(id));
        return "addCourse";
    }

}