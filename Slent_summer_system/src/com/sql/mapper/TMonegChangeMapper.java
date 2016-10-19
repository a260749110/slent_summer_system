package com.sql.mapper;

import com.sql.mapperBean.TMonegChange;
import com.sql.mapperBean.TMonegChangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMonegChangeMapper {
    int countByExample(TMonegChangeExample example);

    int deleteByExample(TMonegChangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMonegChange record);

    int insertSelective(TMonegChange record);

    List<TMonegChange> selectByExampleWithBLOBs(TMonegChangeExample example);

    List<TMonegChange> selectByExample(TMonegChangeExample example);

    TMonegChange selectByPrimaryKey(Integer id);
    TMonegChange selectByLast();
    int updateByExampleSelective(@Param("record") TMonegChange record, @Param("example") TMonegChangeExample example);

    int updateByExampleWithBLOBs(@Param("record") TMonegChange record, @Param("example") TMonegChangeExample example);

    int updateByExample(@Param("record") TMonegChange record, @Param("example") TMonegChangeExample example);

    int updateByPrimaryKeySelective(TMonegChange record);

    int updateByPrimaryKeyWithBLOBs(TMonegChange record);

    int updateByPrimaryKey(TMonegChange record);
}