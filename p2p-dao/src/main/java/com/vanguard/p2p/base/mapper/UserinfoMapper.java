package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.business.domain.BaseInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public interface UserinfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BaseInformation record);

    int insertSelective(BaseInformation record);

    List<BaseInformation> selectByExample(UserInfoExample example);

    BaseInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BaseInformation record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") BaseInformation record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(BaseInformation record);

    int updateByPrimaryKey(BaseInformation record);
}