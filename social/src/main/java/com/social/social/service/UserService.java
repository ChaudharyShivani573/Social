package com.social.social.service;

import com.social.social.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface UserService  {

public User saveUser(User user);

}
