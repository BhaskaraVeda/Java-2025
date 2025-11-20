package com.wipro.WiproSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<Map<String, Object>> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public String addUser(@RequestBody User u) {
        int r = userService.addUser(u);
        return r == 1 ? "User added" : "Add failed";
    }

    @GetMapping("/users/{id}")
    public Map<String, Object> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PutMapping("/users/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User u) {
        int r = userService.updateUser(id, u);
        return r == 1 ? "User updated" : "Update failed";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable String id) {
        int r = userService.deleteUser(id);
        return r == 1 ? "User deleted" : "Delete failed";
    }
}
