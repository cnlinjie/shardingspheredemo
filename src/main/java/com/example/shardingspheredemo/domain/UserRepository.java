package com.example.shardingspheredemo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author linjie
 * @date 2021/3/16
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
