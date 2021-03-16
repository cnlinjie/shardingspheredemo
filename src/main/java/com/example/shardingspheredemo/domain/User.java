package com.example.shardingspheredemo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author linjie
 * @date 2021/3/16
 */
@Entity
@Table(name = "tb_user")
@Getter
@Slf4j
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "pk_id")
    private Long id;

    private String username;

    public User(String username) {
        this.id = System.currentTimeMillis();
        this.username = username;
    }
}
