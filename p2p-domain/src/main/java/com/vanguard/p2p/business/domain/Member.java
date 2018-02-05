package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.domain.BaseDomain;

import java.util.Date;

/**
 * @author vanguard
 * @version 1.0
 * @describe 用户实体类
 * @date 18/2/5
 */
public class Member extends BaseDomain {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    /**
     * 状态 0=冻结/1=正常
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建者
     */
    private String createBy;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新者
     */
    private String updateBy;
}
