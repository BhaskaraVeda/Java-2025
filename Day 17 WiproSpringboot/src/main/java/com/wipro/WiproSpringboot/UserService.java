package com.wipro.WiproSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbc;

    public List<Map<String, Object>> getAllUsers() {
        return jdbc.queryForList("SELECT * FROM users");
    }

    public int addUser(User u) {
        String sql = "INSERT INTO users(eid, name, password, salary) VALUES (?, ?, ?, ?)";
        return jdbc.update(sql, u.getEid(), u.getName(), u.getPassword(), u.getSalary());
    }

    public Map<String, Object> getUserById(String id) {
        return jdbc.queryForMap("SELECT * FROM users WHERE eid = ?", id);
    }

    public int updateUser(String id, User u) {
        String sql = "UPDATE users SET name=?, password=?, salary=? WHERE eid=?";
        return jdbc.update(sql, u.getName(), u.getPassword(), u.getSalary(), id);
    }

    public int deleteUser(String id) {
        return jdbc.update("DELETE FROM users WHERE eid=?", id);
    }
}
