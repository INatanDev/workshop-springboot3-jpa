package com.inatandev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inatandev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
