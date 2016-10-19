package com.sql.mapper;

import com.sql.mapperBean.TMoneyChangeType;
import com.sql.mapperBean.TMoneyChangeTypeExample;
import com.sql.mapperBean.TMoneyChangeTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMoneyChangeTypeMapper {
    int countByExample(TMoneyChangeTypeExample example);

    int deleteByExample(TMoneyChangeTypeExample example);

    int deleteByPrimaryKey(TMoneyChangeTypeKey key);

    int insert(TMoneyChangeType record);

    int insertSelective(TMoneyChangeType record);

    List<TMoneyChangeType> selectByExampleWithBLOBs(TMoneyChangeTypeExample example);

    List<TMoneyChangeType> selectByExample(TMoneyChangeTypeExample example);

    TMoneyChangeType selectByPrimaryKey(TMoneyChangeTypeKey key);

    int updateByExampleSelective(@Param("record") TMoneyChangeType record, @Param("example") TMoneyChangeTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") TMoneyChangeType record, @Param("example") TMoneyChangeTypeExample example);

    int updateByExample(@Param("record") TMoneyChangeType record, @Param("example") TMoneyChangeTypeExample example);

    int updateByPrimaryKeySelective(TMoneyChangeType record);

    int updateByPrimaryKeyWithBLOBs(TMoneyChangeType record);

    int updateByPrimaryKey(TMoneyChangeType record);
}