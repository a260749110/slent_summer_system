package com.sql.mapper;

import com.sql.mapperBean.TSilemtSummerSellInfo;
import com.sql.mapperBean.TSilemtSummerSellInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSilemtSummerSellInfoMapper {
    int countByExample(TSilemtSummerSellInfoExample example);

    int deleteByExample(TSilemtSummerSellInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSilemtSummerSellInfo record);

    int insertSelective(TSilemtSummerSellInfo record);

    List<TSilemtSummerSellInfo> selectByExample(TSilemtSummerSellInfoExample example);

    TSilemtSummerSellInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSilemtSummerSellInfo record, @Param("example") TSilemtSummerSellInfoExample example);

    int updateByExample(@Param("record") TSilemtSummerSellInfo record, @Param("example") TSilemtSummerSellInfoExample example);

    int updateByPrimaryKeySelective(TSilemtSummerSellInfo record);

    int updateByPrimaryKey(TSilemtSummerSellInfo record);
}