package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.UserFile;
import com.vanguard.p2p.base.domain.UserFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
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