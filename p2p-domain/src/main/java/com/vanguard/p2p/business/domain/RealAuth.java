package com.vanguard.p2p.business.domain;

import com.vanguard.p2p.base.domain.BaseAuditDomain;
import lombok.Getter;
import lombok.Setter;

/**
 * @descripe 实名认证实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class RealAuth extends BaseAuditDomain {
    /**
     * 真实姓名
     */
    private String realname;
    /**
     * 性别 0=男/1=女
     */
    private Integer sex;
    /**
     * 出生日期
     */
    private String borndate;
    /**
     * 身份证号
     */
    private String idnumber;
    /**
     * 证件住址
     */
    private String address;

    private Byte state;
    /**
     * 身份证正面照片
     */
    private String image1;
    /**
     * 身份证反面照片
     */
    private String image2;

    public String getSex() {
        return sex == 0 ? "男" : "女";
    }

}