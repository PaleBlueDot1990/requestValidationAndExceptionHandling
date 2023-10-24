package com.bhuvnesh.requestValidationAndExceptionHandling.Controller;

import com.bhuvnesh.requestValidationAndExceptionHandling.Dto.UserRequest;
import com.bhuvnesh.requestValidationAndExceptionHandling.Entity.User;
import com.bhuvnesh.requestValidationAndExceptionHandling.Exceptions.UserNotFoundException;
import com.bhuvnesh.requestValidationAndExceptionHandling.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest)
    {
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>> getAllUsers()
    {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) throws UserNotFoundException
    {
        return ResponseEntity.ok(userService.getUser(id));
    }

}
