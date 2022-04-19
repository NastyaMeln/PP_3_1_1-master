package kata.academy.springboot.controller;

import kata.academy.springboot.model.User;
import kata.academy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public List<User> addUser(@RequestBody User user) {
        userService.addUser(user);
        return userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public List<User> updateUser(@RequestBody User user, @PathVariable long id) {
        userService.updateUser(user, id);
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public List<User> deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
        return userService.getAllUsers();
    }
}
