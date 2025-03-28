package com.matheusconrado.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusconrado.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
