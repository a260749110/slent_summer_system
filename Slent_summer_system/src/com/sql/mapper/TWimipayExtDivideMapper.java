package com.sql.mapper;

import com.sql.bean.TWimipayExtDivide;
import com.sql.bean.TWimipayExtDivideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayExtDivideMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TWimipayExtDivide record);

    int insertSelective(TWimipayExtDivide record);

    List<TWimipayExtDivide> selectByExample(TWimipayExtDivideExample example);

    TWimipayExtDivide selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWimipayExtDivide record, @Param("example") TWimipayExtDivideExample example);

    int updateByExample(@Param("record") TWimipayExtDivide record, @Param("example") TWimipayExtDivideExample example);

    int updateByPrimaryKeySelective(TWimipayExtDivide record);

    int updateByPrimaryKey(TWimipayExtDivide record);
}