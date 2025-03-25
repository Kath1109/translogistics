package com.translogistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.translogistics.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

