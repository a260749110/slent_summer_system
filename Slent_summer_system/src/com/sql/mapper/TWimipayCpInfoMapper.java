package com.sql.mapper;

import com.sql.bean.TWimipayCpInfo;
import com.sql.bean.TWimipayCpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayCpInfoMapper {
    int deleteByPrimaryKey(String prefix);

    int insert(TWimipayCpInfo record);

    int insertSelective(TWimipayCpInfo record);

    List<TWimipayCpInfo> selectByExample(TWimipayCpInfoExample example);

    TWimipayCpInfo selectByPrimaryKey(String prefix);

    int updateByExampleSelective(@Param("record") TWimipayCpInfo record, @Param("example") TWimipayCpInfoExample example);

    int updateByExample(@Param("record") TWimipayCpInfo record, @Param("example") TWimipayCpInfoExample example);

    int updateByPrimaryKeySelective(TWimipayCpInfo record);

    int updateByPrimaryKey(TWimipayCpInfo record);
}