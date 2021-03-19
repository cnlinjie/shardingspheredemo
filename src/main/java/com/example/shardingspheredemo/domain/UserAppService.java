package com.example.shardingspheredemo.domain;

import org.apache.shardingsphere.api.hint.HintManager;
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
        try (HintManager hintManager = HintManager.getInstance()) {
            hintManager.setDatabaseShardingValue("db1");
            User user = new User(username);
            repository.save(user);
        }
    }

    @Transactional
    public List<User> findAll() {
        try (HintManager hintManager = HintManager.getInstance()) {
            hintManager.setDatabaseShardingValue("db1");
            return repository.findAll();
        }
    }

}
