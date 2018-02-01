package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.Emailverify;
import com.vanguard.p2p.base.domain.EmailverifyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public interface EmailverifyMapper {
    int countByExample(EmailverifyExample example);

    int deleteByExample(EmailverifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Emailverify record);

    int insertSelective(Emailverify record);

    List<Emailverify> selectByExample(EmailverifyExample example);

    Emailverify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Emailverify record, @Param("example") EmailverifyExample example);

    int updateByExample(@Param("record") Emailverify record, @Param("example") EmailverifyExample example);

    int updateByPrimaryKeySelective(Emailverify record);

    int updateByPrimaryKey(Emailverify record);
}