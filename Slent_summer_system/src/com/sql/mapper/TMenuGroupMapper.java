package com.sql.mapper;

import com.sql.mapperXml.TMenuGroup;
import com.sql.mapperXml.TMenuGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuGroupMapper {
    int countByExample(TMenuGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMenuGroup record);

    int insertSelective(TMenuGroup record);

    List<TMenuGroup> selectByExampleWithBLOBs(TMenuGroupExample example);

    List<TMenuGroup> selectByExample(TMenuGroupExample example);

    TMenuGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMenuGroup record, @Param("example") TMenuGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") TMenuGroup record, @Param("example") TMenuGroupExample example);

    int updateByExample(@Param("record") TMenuGroup record, @Param("example") TMenuGroupExample example);

    int updateByPrimaryKeySelective(TMenuGroup record);

    int updateByPrimaryKeyWithBLOBs(TMenuGroup record);

    int updateByPrimaryKey(TMenuGroup record);
}