package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Descripe 账户实体类
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
@Setter@Getter
public class Account extends BaseDomain {
    private String tradepassword;

    private BigDecimal usableamount;

    private BigDecimal freezedamount;

    private Integer version;

    private BigDecimal unreceiveinterest;

    private BigDecimal unreceiveprincipal;

    private BigDecimal unreturnamount;

    private BigDecimal remainborrowlimit;

    private BigDecimal borrowlimit;


}