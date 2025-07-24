package com.usercrud.backend.users.service;

import com.usercrud.backend.users.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {
    private final AtomicLong idGenerator = new AtomicLong(1);
    private final List<User> dummyUsers = new ArrayList<>();

    public UserService() {
        // Initialize with dummy data
        dummyUsers.add(new User(idGenerator.getAndIncrement(), "Alice", "Smith", "alice@example.com", "1234"));
        dummyUsers.add(new User(idGenerator.getAndIncrement(), "Bob", "Johnson", "bob@example.com", "abcd"));
        dummyUsers.add(new User(idGenerator.getAndIncrement(), "Charlie", "Brown", "charlie@example.com", "pass"));
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(dummyUsers);
    }
}
