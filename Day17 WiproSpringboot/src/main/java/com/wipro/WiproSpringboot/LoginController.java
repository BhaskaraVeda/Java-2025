package com.wipro.WiproSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private JdbcTemplate jdbc;

    @GetMapping("/login")
    public String checkUser() {
        String sql = "INSERT IGNORE INTO users(eid, name, password, salary) VALUES (?, ?, ?, ?)";
        jdbc.update(sql, "u100", "javatpoint", "java@javatpoint.com", 5000);
        return "login success";
    }
}
