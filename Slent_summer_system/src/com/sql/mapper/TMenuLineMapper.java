package com.sql.mapper;

import com.sql.mapperBean.TMenuLine;
import com.sql.mapperBean.TMenuLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuLineMapper {
    int countByExample(TMenuLineExample example);

    int deleteByExample(TMenuLineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMenuLine record);

    int insertSelective(TMenuLine record);

    List<TMenuLine> selectByExample(TMenuLineExample example);

    TMenuLine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMenuLine record, @Param("example") TMenuLineExample example);

    int updateByExample(@Param("record") TMenuLine record, @Param("example") TMenuLineExample example);

    int updateByPrimaryKeySelective(TMenuLine record);

    int updateByPrimaryKey(TMenuLine record);
}