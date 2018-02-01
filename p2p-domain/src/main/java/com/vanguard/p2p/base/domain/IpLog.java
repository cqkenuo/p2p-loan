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
public class IpLog extends BaseDomain {

    private String ip;

    private Byte state;

    private String username;

    private Long logininfoid;

    private Byte usertype;

    private Date logintime;

}