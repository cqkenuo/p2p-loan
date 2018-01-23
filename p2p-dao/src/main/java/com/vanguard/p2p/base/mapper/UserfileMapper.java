package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.UserFile;
import com.vanguard.p2p.base.domain.UserFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserfileMapper {
    int countByExample(UserFileExample example);

    int deleteByExample(UserFileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserFile record);

    int insertSelective(UserFile record);

    List<UserFile> selectByExample(UserFileExample example);

    UserFile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserFile record, @Param("example") UserFileExample example);

    int updateByExample(@Param("record") UserFile record, @Param("example") UserFileExample example);

    int updateByPrimaryKeySelective(UserFile record);

    int updateByPrimaryKey(UserFile record);
}