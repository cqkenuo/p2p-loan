package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.Systemdictionaryitem;
import com.vanguard.p2p.base.domain.SystemdictionaryitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemdictionaryitemMapper {
    int countByExample(SystemdictionaryitemExample example);

    int deleteByExample(SystemdictionaryitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionaryitem record);

    int insertSelective(Systemdictionaryitem record);

    List<Systemdictionaryitem> selectByExample(SystemdictionaryitemExample example);

    Systemdictionaryitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Systemdictionaryitem record, @Param("example") SystemdictionaryitemExample example);

    int updateByExample(@Param("record") Systemdictionaryitem record, @Param("example") SystemdictionaryitemExample example);

    int updateByPrimaryKeySelective(Systemdictionaryitem record);

    int updateByPrimaryKey(Systemdictionaryitem record);
}