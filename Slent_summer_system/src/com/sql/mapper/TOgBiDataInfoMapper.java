package com.sql.mapper;

import com.sql.bean.TOgBiDataInfo;
import com.sql.bean.TOgBiDataInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOgBiDataInfoMapper {
    int countByExample(TOgBiDataInfoExample example);

    int deleteByExample(TOgBiDataInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TOgBiDataInfo record);

    int insertSelective(TOgBiDataInfo record);

    List<TOgBiDataInfo> selectByExample(TOgBiDataInfoExample example);

    TOgBiDataInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TOgBiDataInfo record, @Param("example") TOgBiDataInfoExample example);

    int updateByExample(@Param("record") TOgBiDataInfo record, @Param("example") TOgBiDataInfoExample example);

    int updateByPrimaryKeySelective(TOgBiDataInfo record);

    int updateByPrimaryKey(TOgBiDataInfo record);
}