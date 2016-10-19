package com.sql.mapper;

import com.sql.bean.TWimipayCodeLimitInfo;
import com.sql.bean.TWimipayCodeLimitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayCodeLimitInfoMapper {
    int countByExample(TWimipayCodeLimitInfoExample example);

    int deleteByExample(TWimipayCodeLimitInfoExample example);

    int deleteByPrimaryKey(Integer type);

    int insert(TWimipayCodeLimitInfo record);

    int insertSelective(TWimipayCodeLimitInfo record);

    List<TWimipayCodeLimitInfo> selectByExample(TWimipayCodeLimitInfoExample example);

    TWimipayCodeLimitInfo selectByPrimaryKey(Integer type);

    int updateByExampleSelective(@Param("record") TWimipayCodeLimitInfo record, @Param("example") TWimipayCodeLimitInfoExample example);

    int updateByExample(@Param("record") TWimipayCodeLimitInfo record, @Param("example") TWimipayCodeLimitInfoExample example);

    int updateByPrimaryKeySelective(TWimipayCodeLimitInfo record);

    int updateByPrimaryKey(TWimipayCodeLimitInfo record);
}