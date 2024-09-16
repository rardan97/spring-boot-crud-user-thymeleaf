package com.blackcode.spring_boot_crud_user_thymeleaf.service;

import com.blackcode.spring_boot_crud_user_thymeleaf.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getListAll();

    Optional<User> getUserById(Long id);

    User addUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}
