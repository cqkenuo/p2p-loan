package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.Systemdictionary;
import com.vanguard.p2p.base.domain.SystemdictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemdictionaryMapper {
    int countByExample(SystemdictionaryExample example);

    int deleteByExample(SystemdictionaryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Systemdictionary record);

    int insertSelective(Systemdictionary record);

    List<Systemdictionary> selectByExample(SystemdictionaryExample example);

    Systemdictionary selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Systemdictionary record, @Param("example") SystemdictionaryExample example);

    int updateByExample(@Param("record") Systemdictionary record, @Param("example") SystemdictionaryExample example);

    int updateByPrimaryKeySelective(Systemdictionary record);

    int updateByPrimaryKey(Systemdictionary record);
}