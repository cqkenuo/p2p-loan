package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.Account;
import com.vanguard.p2p.base.domain.AccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Descripe 账户数据访问层接口
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public interface AccountMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}