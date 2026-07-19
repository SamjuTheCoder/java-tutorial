package com.example.demo.services;

import com.example.demo.model.User;
import com.example.demo.projections.UserProjection;
import com.example.demo.repository.UserRepository;
import com.example.demo.request.UserRequest;
import com.example.demo.request.UserUpdateRequest;
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
    public List<User> findAllUsers() {
       return userRepository.findAll();
    }

    // delete record by id
    public void deleteUserById(Long id) {
       userRepository.deleteById(id);
    }

    // find record by id
    public User getUserById(Long id) {
       return userRepository.findById(id).orElse(null);
    }

    // update user record
    public User updateUser(UserUpdateRequest userUpdateRequest) {

       // find the user that you want to update record for by id of the user - User Model
       User user = userRepository.findById(userUpdateRequest.getId()).orElse(null);

       // use the data of the user to update the record coming from the payload - UserUpdateRequest
        // and save any changes made in the UserUpdateRequest
       user.setName(userUpdateRequest.getName());
       user.setEmail(userUpdateRequest.getEmail());
       user.setPhone(userUpdateRequest.getPhone());
       user.setGender(userUpdateRequest.getGender());
       user.setMaritalStatus(userUpdateRequest.getMaritalStatus());
       return userRepository.save(user);

    }

    // list all just name, email, phone
    public List<UserProjection> findUserProjections() {
       return userRepository.findAllBy();
    }


}
