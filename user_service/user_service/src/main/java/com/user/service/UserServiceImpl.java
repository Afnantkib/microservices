package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    //fake user list
    List<User> list = List.of(new User(1L,"Afnan", "88250016"),
            new User(2L, "Ravi", "123456"),
            new User(3L, "Rahul", "45678"));
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
