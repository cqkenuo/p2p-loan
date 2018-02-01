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
public class VideoAuth extends BaseDomain {

    private Byte state;

    private String remark;

    private Date audittime;

    private Date applytime;

    private Long auditorId;

    private Long applierId;
    
}