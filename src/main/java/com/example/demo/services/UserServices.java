package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.UserRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    // user repository interface
   private final UserRepository userRepository;

   // constructor injection
   public UserServices(UserRepository userRepository) {
       this.userRepository = userRepository;
   }

    // save record to db
    public User saveUser(UserRequest userRequest) {

       User user = new User();
       user.setName(userRequest.getName());
       user.setEmail(userRequest.getEmail());
       user.setPhone(userRequest.getPhone());
       user.setGender(userRequest.getGender());
       user.setMaritalStatus(userRequest.getMaritalStatus());
       userRepository.save(user);
       return user;
    }

    // list all records
    public List<User> findAll() {
       return userRepository.findAll();
    }

}
