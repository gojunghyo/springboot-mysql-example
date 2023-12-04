package com.example.gojghomysql.service;

import com.example.gojghomysql.entity.User;
import com.example.gojghomysql.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String savedUser(String name, String email) {
        try {
            User user = User.builder()
                    .name(name)
                    .email(email)
                    .build();

            userRepository.save(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "not saved!";
        }
        return "saved";
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
