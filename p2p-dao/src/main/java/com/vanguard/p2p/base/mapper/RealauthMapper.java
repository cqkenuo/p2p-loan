package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.business.domain.RealAuth;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public interface RealauthMapper {
    int countByExample(RealAuthExample example);

    int deleteByExample(RealAuthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RealAuth record);

    int insertSelective(RealAuth record);

    List<RealAuth> selectByExample(RealAuthExample example);

    RealAuth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RealAuth record, @Param("example") RealAuthExample example);

    int updateByExample(@Param("record") RealAuth record, @Param("example") RealAuthExample example);

    int updateByPrimaryKeySelective(RealAuth record);

    int updateByPrimaryKey(RealAuth record);
}