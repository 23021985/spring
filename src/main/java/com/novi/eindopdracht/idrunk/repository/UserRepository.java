package com.novi.eindopdracht.idrunk.repository;

import com.novi.eindopdracht.idrunk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}