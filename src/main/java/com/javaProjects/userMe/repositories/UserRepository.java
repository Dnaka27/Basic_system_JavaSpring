package com.javaProjects.userMe.repositories;

import com.javaProjects.userMe.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
