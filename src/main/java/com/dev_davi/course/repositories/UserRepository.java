package com.dev_davi.course.repositories;

import org.apache.commons.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev_davi.course.entities.User;

@SuppressWarnings("unused")
public interface UserRepository extends JpaRepository<User, Long>{

}
