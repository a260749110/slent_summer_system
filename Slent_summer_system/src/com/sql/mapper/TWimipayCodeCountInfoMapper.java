package com.sql.mapper;

import com.sql.bean.TWimipayCodeCountInfo;
import com.sql.bean.TWimipayCodeCountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayCodeCountInfoMapper {
    int countByExample(TWimipayCodeCountInfoExample example);

    int deleteByExample(TWimipayCodeCountInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWimipayCodeCountInfo record);

    int insertSelective(TWimipayCodeCountInfo record);

    List<TWimipayCodeCountInfo> selectByExample(TWimipayCodeCountInfoExample example);

    List<TWimipayCodeCountInfo> selectByTable(TWimipayCodeCountInfo record);
    int updateByTable(TWimipayCodeCountInfo record);
    
    TWimipayCodeCountInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWimipayCodeCountInfo record, @Param("example") TWimipayCodeCountInfoExample example);

    int updateByExample(@Param("record") TWimipayCodeCountInfo record, @Param("example") TWimipayCodeCountInfoExample example);

    int updateByPrimaryKeySelective(TWimipayCodeCountInfo record);

    int updateByPrimaryKey(TWimipayCodeCountInfo record);
}