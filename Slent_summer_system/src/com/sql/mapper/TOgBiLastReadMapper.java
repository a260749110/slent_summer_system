package com.sql.mapper;

import com.sql.mapperXml.TOgBiLastRead;
import com.sql.mapperXml.TOgBiLastReadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOgBiLastReadMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TOgBiLastRead record);

    int insertSelective(TOgBiLastRead record);

    List<TOgBiLastRead> selectByExampleWithBLOBs(TOgBiLastReadExample example);

    List<TOgBiLastRead> selectByExample(TOgBiLastReadExample example);

    TOgBiLastRead selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TOgBiLastRead record, @Param("example") TOgBiLastReadExample example);

    int updateByExampleWithBLOBs(@Param("record") TOgBiLastRead record, @Param("example") TOgBiLastReadExample example);

    int updateByExample(@Param("record") TOgBiLastRead record, @Param("example") TOgBiLastReadExample example);

    int updateByPrimaryKeySelective(TOgBiLastRead record);

    int updateByPrimaryKeyWithBLOBs(TOgBiLastRead record);
}