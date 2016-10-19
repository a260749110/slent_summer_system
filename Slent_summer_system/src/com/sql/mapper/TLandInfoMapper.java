package com.sql.mapper;

import com.sql.mapperBean.TLandInfo;
import com.sql.mapperBean.TLandInfoExample;
import com.sql.mapperBean.TLandInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLandInfoMapper {
    int countByExample(TLandInfoExample example);

    int deleteByExample(TLandInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLandInfoWithBLOBs record);

    int insertSelective(TLandInfoWithBLOBs record);

    List<TLandInfoWithBLOBs> selectByExampleWithBLOBs(TLandInfoExample example);

    List<TLandInfo> selectByExample(TLandInfoExample example);

    TLandInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLandInfoWithBLOBs record, @Param("example") TLandInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TLandInfoWithBLOBs record, @Param("example") TLandInfoExample example);

    int updateByExample(@Param("record") TLandInfo record, @Param("example") TLandInfoExample example);

    int updateByPrimaryKeySelective(TLandInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TLandInfoWithBLOBs record);

    int updateByPrimaryKey(TLandInfo record);
}