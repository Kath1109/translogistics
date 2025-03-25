package com.translogistics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.translogistics.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}