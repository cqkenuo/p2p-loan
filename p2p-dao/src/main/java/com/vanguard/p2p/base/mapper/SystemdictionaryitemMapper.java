package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.SystemDictionaryItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public interface SystemdictionaryitemMapper {
    int countByExample(SystemDictionaryItemExample example);

    int deleteByExample(SystemDictionaryItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemDictionaryItem record);

    int insertSelective(SystemDictionaryItem record);

    List<SystemDictionaryItem> selectByExample(SystemDictionaryItemExample example);

    SystemDictionaryItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemDictionaryItem record, @Param("example") SystemDictionaryItemExample example);

    int updateByExample(@Param("record") SystemDictionaryItem record, @Param("example") SystemDictionaryItemExample example);

    int updateByPrimaryKeySelective(SystemDictionaryItem record);

    int updateByPrimaryKey(SystemDictionaryItem record);
}