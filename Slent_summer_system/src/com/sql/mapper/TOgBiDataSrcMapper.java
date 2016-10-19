package com.sql.mapper;

import com.sql.bean.TOgBiDataSrc;
import com.sql.bean.TOgBiDataSrcExample;
import com.sql.bean.TOgBiDataSrcWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOgBiDataSrcMapper {
    int deleteByExample(TOgBiDataSrcExample example);

    int deleteByPrimaryKey(String bSession);
    int insertAll(List<TOgBiDataSrcWithBLOBs> record);
    int insert(TOgBiDataSrcWithBLOBs record);

    int insertSelective(TOgBiDataSrcWithBLOBs record);

    List<TOgBiDataSrcWithBLOBs> selectByExampleWithBLOBs(TOgBiDataSrcExample example);
    List<TOgBiDataSrcWithBLOBs> selectAnyone(java.lang.Integer data);
    List<TOgBiDataSrc> selectByExample(TOgBiDataSrcExample example);

    TOgBiDataSrcWithBLOBs selectByPrimaryKey(String bSession);
    
    int updateByExampleSelective(@Param("record") TOgBiDataSrcWithBLOBs record, @Param("example") TOgBiDataSrcExample example);

    int updateByExampleWithBLOBs(@Param("record") TOgBiDataSrcWithBLOBs record, @Param("example") TOgBiDataSrcExample example);

    int updateByExample(@Param("record") TOgBiDataSrc record, @Param("example") TOgBiDataSrcExample example);

    int updateByPrimaryKeySelective(TOgBiDataSrcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TOgBiDataSrcWithBLOBs record);

    int updateByPrimaryKey(TOgBiDataSrc record);
}