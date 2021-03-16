package com.example.shardingspheredemo.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author linjie
 * @date 2021/3/16
 */
@Service
public class UserAppService {

    private final UserRepository repository;

    public UserAppService(UserRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void save(String username) {
        User user = new User();
    }

    public List<User> findAll() {
        return repository.findAll();
    }

}
