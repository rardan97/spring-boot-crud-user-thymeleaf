package com.blackcode.spring_boot_crud_user_thymeleaf.controller;

import com.blackcode.spring_boot_crud_user_thymeleaf.model.User;
import com.blackcode.spring_boot_crud_user_thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getListUser(Model model){
        List<User> dataUser = userService.getListAll();
        Integer countData = dataUser.size();
        model.addAttribute("dataUserList", dataUser);
        model.addAttribute("countDataUser", countData);
        return "user";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") Long id, Model model){
        Optional<User> userData = userService.getUserById(id);
        model.addAttribute("dataUserList", userData.get());
        return "user";
    }

    @GetMapping("/viewAddUser")
    public String viewAddUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "UserAdd";
    }

    @PostMapping("/save")
    public String addDataUser(@ModelAttribute("user") User user){
        userService.addUser(user);
        return "redirect:/user";
    }

    @GetMapping("/viewUpdateUser/{id}")
    public String viewUpdateUser(@PathVariable("id") Long id, Model model){
        Optional<User> userData = userService.getUserById(id);
        model.addAttribute("user", userData.get());
        return "UserEdit";
    }

    @PostMapping("/update")
    public String updateDataUser(@ModelAttribute("user") User user){
        Long id = user.getUser_id();
        userService.updateUser(id, user);
        return "redirect:/user";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return "redirect:/user";
    }

}
