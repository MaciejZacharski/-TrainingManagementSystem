package com.CourseService.courseSystem.controller.user;


import com.CourseService.courseSystem.entity.user.User;
import com.CourseService.courseSystem.service.RoleService;
import com.CourseService.courseSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/register", method = RequestMethod.GET)
public class RegisterController {


    private RoleService roleService;

    private UserService userService;
    @Autowired
    public RegisterController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public String register(Model model) {

        model.addAttribute("user", new User());

        return "userRegister";
    }

    @PostMapping("/confirmationPage")
    public String registerConfirmation(@ModelAttribute User user,
                                  Model model) {

        user.setRole(roleService.findByRoleName("User"));



        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setStatus(true);
        model.addAttribute("user", user);
        userService.save(user);
        return "registerConfirmationPage";
    }
}
