package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.IpLog;
import com.vanguard.p2p.base.domain.IplogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public interface IplogMapper {
    int countByExample(IplogExample example);

    int deleteByExample(IplogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(IpLog record);

    int insertSelective(IpLog record);

    List<IpLog> selectByExample(IplogExample example);

    IpLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") IpLog record, @Param("example") IplogExample example);

    int updateByExample(@Param("record") IpLog record, @Param("example") IplogExample example);

    int updateByPrimaryKeySelective(IpLog record);

    int updateByPrimaryKey(IpLog record);
}