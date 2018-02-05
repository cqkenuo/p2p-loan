package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.business.domain.EmailActive;
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

    int insert(EmailActive record);

    int insertSelective(EmailActive record);

    List<EmailActive> selectByExample(EmailverifyExample example);

    EmailActive selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EmailActive record, @Param("example") EmailverifyExample example);

    int updateByExample(@Param("record") EmailActive record, @Param("example") EmailverifyExample example);

    int updateByPrimaryKeySelective(EmailActive record);

    int updateByPrimaryKey(EmailActive record);
}