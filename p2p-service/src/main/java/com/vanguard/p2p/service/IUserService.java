package com.vanguard.p2p.service;

import com.vanguard.p2p.base.domain.User;
import com.vanguard.p2p.utils.JsonResult;

/**
 * @Descripe 用户业务的接口类
 * @Author vanguard
 * @Date: 18/1/31
 * @Version 1.0
 *
 */
public interface IUserService {

    /**
     * 检查用户名是否存在
     * @param username
     */
    JsonResult checkUsername(String username);

    /**
     * 用户注册,注册成功后创建对应的UserInfo和Account对象
     * @param user
     */
    JsonResult register(User user);

    /**
     * 用户登录，无论登录成功还是失败，都需要将IP记录到登录日志中
     * @param user
     * @param ip
     * @return
     */
    JsonResult login(User user, String ip);

    /**
     * 注销登录，删除Session中的User对象
     */
    void logout();
}
