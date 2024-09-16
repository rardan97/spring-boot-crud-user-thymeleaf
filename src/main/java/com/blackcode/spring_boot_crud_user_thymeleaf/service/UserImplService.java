package com.blackcode.spring_boot_crud_user_thymeleaf.service;

import com.blackcode.spring_boot_crud_user_thymeleaf.model.User;
import com.blackcode.spring_boot_crud_user_thymeleaf.repositroy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImplService implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getListAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User userData = userRepository.findById(id).get();
        userData.setUser_name(user.getUser_name());
        userData.setUser_email(user.getUser_email());
        userData.setUser_phoneNumber(user.getUser_phoneNumber());
        userData.setUser_address(user.getUser_address());
        return userRepository.save(userData);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
