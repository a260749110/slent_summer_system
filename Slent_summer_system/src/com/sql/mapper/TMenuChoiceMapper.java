package com.sql.mapper;

import com.sql.mapperXml.TMenuChoice;
import com.sql.mapperXml.TMenuChoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuChoiceMapper {
    int countByExample(TMenuChoiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMenuChoice record);

    int insertSelective(TMenuChoice record);

    List<TMenuChoice> selectByExampleWithBLOBs(TMenuChoiceExample example);

    List<TMenuChoice> selectByExample(TMenuChoiceExample example);

    TMenuChoice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMenuChoice record, @Param("example") TMenuChoiceExample example);

    int updateByExampleWithBLOBs(@Param("record") TMenuChoice record, @Param("example") TMenuChoiceExample example);

    int updateByExample(@Param("record") TMenuChoice record, @Param("example") TMenuChoiceExample example);

    int updateByPrimaryKeySelective(TMenuChoice record);

    int updateByPrimaryKeyWithBLOBs(TMenuChoice record);
}