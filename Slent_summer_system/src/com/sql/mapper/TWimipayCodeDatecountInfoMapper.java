package com.sql.mapper;

import com.sql.bean.TWimipayCodeDatecountInfo;
import com.sql.bean.TWimipayCodeDatecountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayCodeDatecountInfoMapper {
    int countByExample(TWimipayCodeDatecountInfoExample example);

    int deleteByExample(TWimipayCodeDatecountInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWimipayCodeDatecountInfo record);

    int insertSelective(TWimipayCodeDatecountInfo record);

    List<TWimipayCodeDatecountInfo> selectByExample(TWimipayCodeDatecountInfoExample example);

    List<TWimipayCodeDatecountInfo> selectByTable(TWimipayCodeDatecountInfo record);
    
    TWimipayCodeDatecountInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWimipayCodeDatecountInfo record, @Param("example") TWimipayCodeDatecountInfoExample example);

    int updateByExample(@Param("record") TWimipayCodeDatecountInfo record, @Param("example") TWimipayCodeDatecountInfoExample example);

    int updateByPrimaryKeySelective(TWimipayCodeDatecountInfo record);

    int updateByPrimaryKey(TWimipayCodeDatecountInfo record);
}