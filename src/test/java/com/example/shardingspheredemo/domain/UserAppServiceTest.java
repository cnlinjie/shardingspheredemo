package com.example.shardingspheredemo.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author linjie
 * @date 2021/3/16
 */
@SpringBootTest
@Slf4j
class UserAppServiceTest {

    @Autowired
    private UserAppService userAppService;

    @Test
    void save() {
    }

    @Test
    void findAll() {
        List<User> all = userAppService.findAll();
        log.info("查询记录数:{}",all.size());
    }
}