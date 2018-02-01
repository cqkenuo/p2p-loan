package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.SystemDictionary;
import com.vanguard.p2p.base.domain.SystemDictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public interface SystemdictionaryMapper {
    int countByExample(SystemDictionaryExample example);

    int deleteByExample(SystemDictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SystemDictionary record);

    int insertSelective(SystemDictionary record);

    List<SystemDictionary> selectByExample(SystemDictionaryExample example);

    SystemDictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SystemDictionary record, @Param("example") SystemDictionaryExample example);

    int updateByExample(@Param("record") SystemDictionary record, @Param("example") SystemDictionaryExample example);

    int updateByPrimaryKeySelective(SystemDictionary record);

    int updateByPrimaryKey(SystemDictionary record);
}