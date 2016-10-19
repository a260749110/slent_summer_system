package com.sql.mapper;

import com.sql.bean.TWimipayTemplateInifo;
import com.sql.bean.TWimipayTemplateInifoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWimipayTemplateInifoMapper {
    int deleteByPrimaryKey(String wipayId);

    int insert(TWimipayTemplateInifo record);

    int insertSelective(TWimipayTemplateInifo record);

    List<TWimipayTemplateInifo> selectByExample(TWimipayTemplateInifoExample example);
    List<TWimipayTemplateInifo> selectByTable(TWimipayTemplateInifo record);
    TWimipayTemplateInifo selectByPrimaryKey(String wipayId);

    int updateByExampleSelective(@Param("record") TWimipayTemplateInifo record, @Param("example") TWimipayTemplateInifoExample example);

    int updateByExample(@Param("record") TWimipayTemplateInifo record, @Param("example") TWimipayTemplateInifoExample example);

    int updateByPrimaryKeySelective(TWimipayTemplateInifo record);

    int updateByPrimaryKey(TWimipayTemplateInifo record);
}