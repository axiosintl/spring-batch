package com.ai.springbatchexample1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ai.springbatchexample1.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
