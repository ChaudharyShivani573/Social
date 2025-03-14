package com.social.social.serviceImpl;

import com.social.social.custom.exceptions.EmptyInputException;
import com.social.social.entities.User;
import com.social.social.repositories.UserRepository;
import com.social.social.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
public class UserServiceImpl implements UserService {

@Autowired
private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        if(user.getUserName().isEmpty()|| user.getEmailId().isEmpty()){
            throw new EmptyInputException( HttpStatus.BAD_REQUEST.toString(),"Please provide the name and the emailId");
        }
        User userCreated= null;
        try{
             userCreated = userRepository.save(user);

        }catch (Exception exception){
            exception.printStackTrace();
        }

        return userCreated;
    }
}
