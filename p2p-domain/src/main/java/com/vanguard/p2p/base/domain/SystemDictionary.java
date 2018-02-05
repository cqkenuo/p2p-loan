package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @descripe 数据字典实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class SystemDictionary extends BaseDomain {
    /**
     * 编码
     */
    private String sn;
    /**
     * 名称
     */
    private String title;
    /**
     * 简介
     */
    private String intro;

}