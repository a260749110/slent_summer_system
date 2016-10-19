package com.sql.mapper;

import com.sql.bean.TWimipayTelecomPercent;
import com.sql.bean.TWimipayTelecomPercentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayTelecomPercentMapper {
    int countByExample(TWimipayTelecomPercentExample example);

    int deleteByExample(TWimipayTelecomPercentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWimipayTelecomPercent record);

    int insertSelective(TWimipayTelecomPercent record);

    List<TWimipayTelecomPercent> selectByExample(TWimipayTelecomPercentExample example);

    TWimipayTelecomPercent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWimipayTelecomPercent record, @Param("example") TWimipayTelecomPercentExample example);

    int updateByExample(@Param("record") TWimipayTelecomPercent record, @Param("example") TWimipayTelecomPercentExample example);

    int updateByPrimaryKeySelective(TWimipayTelecomPercent record);

    int updateByPrimaryKey(TWimipayTelecomPercent record);
}