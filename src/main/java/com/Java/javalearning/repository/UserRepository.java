package com.Java.javalearning.repository;

import com.Java.javalearning.entity.User;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Id> {
}
