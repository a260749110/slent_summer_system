package com.sql.mapper;

import com.sql.bean.TWimipayUnicomPercent;
import com.sql.bean.TWimipayUnicomPercentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayUnicomPercentMapper {
    int countByExample(TWimipayUnicomPercentExample example);

    int deleteByExample(TWimipayUnicomPercentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWimipayUnicomPercent record);

    int insertSelective(TWimipayUnicomPercent record);

    List<TWimipayUnicomPercent> selectByExample(TWimipayUnicomPercentExample example);

    TWimipayUnicomPercent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWimipayUnicomPercent record, @Param("example") TWimipayUnicomPercentExample example);

    int updateByExample(@Param("record") TWimipayUnicomPercent record, @Param("example") TWimipayUnicomPercentExample example);

    int updateByPrimaryKeySelective(TWimipayUnicomPercent record);

    int updateByPrimaryKey(TWimipayUnicomPercent record);
}