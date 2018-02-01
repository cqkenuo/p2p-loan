package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
@Setter@Getter
public class Emailverify extends BaseDomain {

    private String email;

    private Long userinfoId;

    private Date sendtime;

    private String uuid;

}