package com.gourmetdelights.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);

        return userService.convertToUserDTO(registeredUser);
    }

    @GetMapping("/users/{username}")
    public UserDTO getUserByUsername(@PathVariable String username) {
        User user = userService.getUserByUsername(username);

        return userService.convertToUserDTO(user);
    }

    

    

}
