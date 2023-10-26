package com.bhuvnesh.requestValidationAndExceptionHandling.Service;

import com.bhuvnesh.requestValidationAndExceptionHandling.Dto.UserRequest;
import com.bhuvnesh.requestValidationAndExceptionHandling.Entity.User;
import com.bhuvnesh.requestValidationAndExceptionHandling.Exceptions.UserNotFoundException;
import com.bhuvnesh.requestValidationAndExceptionHandling.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest)
    {
        User user = new User(userRequest.getUserID(),
                             userRequest.getName(),
                             userRequest.getEmail(),
                             userRequest.getMobile(),
                             userRequest.getGender(),
                             userRequest.getAge(),
                             userRequest.getNationality());

        return userRepository.save(user);
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException
    {
        User user = userRepository.findByUserID(id);
        if(user == null)
        {
            throw new UserNotFoundException("User not found with the id " + id);
        }
        return user;
    }

}
