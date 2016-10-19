package com.sql.mapper;

import com.sql.bean.TWimipayOtherpayProvince;
import com.sql.bean.TWimipayOtherpayProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayOtherpayProvinceMapper {
    int countByExample(TWimipayOtherpayProvinceExample example);

    int deleteByExample(TWimipayOtherpayProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TWimipayOtherpayProvince record);

    int insertSelective(TWimipayOtherpayProvince record);

    List<TWimipayOtherpayProvince> selectByExample(TWimipayOtherpayProvinceExample example);

    TWimipayOtherpayProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TWimipayOtherpayProvince record, @Param("example") TWimipayOtherpayProvinceExample example);

    int updateByExample(@Param("record") TWimipayOtherpayProvince record, @Param("example") TWimipayOtherpayProvinceExample example);

    int updateByPrimaryKeySelective(TWimipayOtherpayProvince record);

    int updateByPrimaryKey(TWimipayOtherpayProvince record);
}