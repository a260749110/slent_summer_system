package com.sql.mapper;

import com.sql.mapperXml.TNoahTitlesExample;
import com.sql.mapperXml.TNoahTitlesKey;
import com.sql.mapperXml.TNoahTitlesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TNoahTitlesMapper {
    int countByExample(TNoahTitlesExample example);

    int deleteByPrimaryKey(TNoahTitlesKey key);

    int insert(TNoahTitlesWithBLOBs record);

    int insertSelective(TNoahTitlesWithBLOBs record);

    List<TNoahTitlesWithBLOBs> selectByExampleWithBLOBs(TNoahTitlesExample example);

    List<TNoahTitlesKey> selectByExample(TNoahTitlesExample example);

    TNoahTitlesWithBLOBs selectByPrimaryKey(TNoahTitlesKey key);

    int updateByExampleSelective(@Param("record") TNoahTitlesWithBLOBs record, @Param("example") TNoahTitlesExample example);

    int updateByExampleWithBLOBs(@Param("record") TNoahTitlesWithBLOBs record, @Param("example") TNoahTitlesExample example);

    int updateByExample(@Param("record") TNoahTitlesKey record, @Param("example") TNoahTitlesExample example);

    int updateByPrimaryKeySelective(TNoahTitlesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TNoahTitlesWithBLOBs record);
}