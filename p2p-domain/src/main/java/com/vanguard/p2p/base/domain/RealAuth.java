package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter@Getter
public class RealAuth extends BaseDomain {

    private String realname;

    private Byte sex;

    private String borndate;

    private String idnumber;

    private String address;

    private Byte state;

    private String image1;

    private String image2;

    private String remark;

    private Date audittime;

    private Date applytime;

    private Long auditorId;

    private Long applierId;

}