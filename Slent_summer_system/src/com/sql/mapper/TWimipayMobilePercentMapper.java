package com.sql.mapper;

import com.sql.bean.TWimipayMobilePercent;
import com.sql.bean.TWimipayMobilePercentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayMobilePercentMapper {
    int countByExample(TWimipayMobilePercentExample example);

    int deleteByExample(TWimipayMobilePercentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWimipayMobilePercent record);

    int insertSelective(TWimipayMobilePercent record);

    List<TWimipayMobilePercent> selectByExample(TWimipayMobilePercentExample example);

    TWimipayMobilePercent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWimipayMobilePercent record, @Param("example") TWimipayMobilePercentExample example);

    int updateByExample(@Param("record") TWimipayMobilePercent record, @Param("example") TWimipayMobilePercentExample example);

    int updateByPrimaryKeySelective(TWimipayMobilePercent record);

    int updateByPrimaryKey(TWimipayMobilePercent record);
}