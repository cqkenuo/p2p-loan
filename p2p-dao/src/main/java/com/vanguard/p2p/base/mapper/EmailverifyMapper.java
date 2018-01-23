package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.Emailverify;
import com.vanguard.p2p.base.domain.EmailverifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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