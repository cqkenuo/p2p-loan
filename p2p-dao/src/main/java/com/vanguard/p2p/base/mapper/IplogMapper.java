package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.Iplog;
import com.vanguard.p2p.base.domain.IplogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IplogMapper {
    int countByExample(IplogExample example);

    int deleteByExample(IplogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Iplog record);

    int insertSelective(Iplog record);

    List<Iplog> selectByExample(IplogExample example);

    Iplog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Iplog record, @Param("example") IplogExample example);

    int updateByExample(@Param("record") Iplog record, @Param("example") IplogExample example);

    int updateByPrimaryKeySelective(Iplog record);

    int updateByPrimaryKey(Iplog record);
}