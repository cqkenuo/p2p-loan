package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.RealAuth;
import com.vanguard.p2p.base.domain.RealAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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