package com.sql.mapper;

import com.sql.mapperBean.TLandId;
import com.sql.mapperBean.TLandIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLandIdMapper {
    int countByExample(TLandIdExample example);

    int deleteByExample(TLandIdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLandId record);

    int insertSelective(TLandId record);

    List<TLandId> selectByExampleWithBLOBs(TLandIdExample example);

    List<TLandId> selectByExample(TLandIdExample example);

    TLandId selectByPrimaryKey(Integer id);
    TLandId selectMax();
    int updateByExampleSelective(@Param("record") TLandId record, @Param("example") TLandIdExample example);

    int updateByExampleWithBLOBs(@Param("record") TLandId record, @Param("example") TLandIdExample example);

    int updateByExample(@Param("record") TLandId record, @Param("example") TLandIdExample example);

    int updateByPrimaryKeySelective(TLandId record);

    int updateByPrimaryKeyWithBLOBs(TLandId record);

    int updateByPrimaryKey(TLandId record);
}