package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class Emailverify extends BaseDomain {

    private String email;

    private Long userinfoId;

    private Date sendtime;

    private String uuid;

}