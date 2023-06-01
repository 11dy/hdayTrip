package com.example.hdayTrip.user.repository;

import com.example.hdayTrip.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserEmail(String email);
}
