package com.vanguard.p2p.base.mapper;

import com.vanguard.p2p.base.domain.VideoAuth;
import com.vanguard.p2p.base.domain.VideoAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoauthMapper {
    int countByExample(VideoAuthExample example);

    int deleteByExample(VideoAuthExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VideoAuth record);

    int insertSelective(VideoAuth record);

    List<VideoAuth> selectByExample(VideoAuthExample example);

    VideoAuth selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VideoAuth record, @Param("example") VideoAuthExample example);

    int updateByExample(@Param("record") VideoAuth record, @Param("example") VideoAuthExample example);

    int updateByPrimaryKeySelective(VideoAuth record);

    int updateByPrimaryKey(VideoAuth record);
}