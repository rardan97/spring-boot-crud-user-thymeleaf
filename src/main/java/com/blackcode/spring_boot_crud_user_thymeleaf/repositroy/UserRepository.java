package com.blackcode.spring_boot_crud_user_thymeleaf.repositroy;

import com.blackcode.spring_boot_crud_user_thymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
