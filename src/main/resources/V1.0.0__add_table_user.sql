-- 用户
DROP TABLE IF EXISTS tb_user;
CREATE TABLE tb_user
(
    pk_id    bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',

    username varchar(256) COMMENT '用户名',

    PRIMARY KEY (pk_id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户';

insert into tb_user(pk_id, username) values (1,'zhagnsan');
insert into tb_user(pk_id, username) values (2,'lisi');