package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class IpLog extends BaseDomain {

    private String ip;

    private Byte state;

    private String username;

    private Long logininfoid;

    private Byte usertype;

    private Date logintime;

}