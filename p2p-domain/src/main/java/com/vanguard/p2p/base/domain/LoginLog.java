package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Descripe 用户登录日志实体类
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
@Setter@Getter
public class LoginLog extends BaseDomain {

    /**
     * 用户登录IP
     */
    private String userIp;

    /**
     * 用户登录状态 0=失败/1=成功
     */
    private Byte state;
    /**
     * 用户名
     */
    private String username;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     *用户状态
     */
    private Byte usertype;
    /**
     * 登录时间
     */
    private Date loginTime;

}