package com.vanguard.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @descripe 数据字典项实体类
 * @author vanguard
 * @date: 2018/02/05
 * @version 1.0
 *
 */
@Setter@Getter
public class SystemDictionaryItem extends BaseDomain {
    /**
     * 系统目录
     */
    private Long parentid;
    /**
     * 名称
     */
    private String title;
    /**
     * 值
     */
    private String tvalue;
    /**
     * 序列
     */
    private Byte sequence;
    /**
     * 说明
     */
    private String intro;

}