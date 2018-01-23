package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class User extends BaseDomain {

    private String username;

    private String password;

    private int state; //账号状态  0：启用账号  1：禁用账号

    private int userType; //用户类型  0：前台用户  1：后台用户

    public User() {
        super();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}