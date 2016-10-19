package com.sql.mapper;

import com.sql.mapperBean.TMenuPaymentInfo;
import com.sql.mapperBean.TMenuPaymentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMenuPaymentInfoMapper {
    int countByExample(TMenuPaymentInfoExample example);

    int deleteByExample(TMenuPaymentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TMenuPaymentInfo record);

    int insertSelective(TMenuPaymentInfo record);

    List<TMenuPaymentInfo> selectByExample(TMenuPaymentInfoExample example);

    TMenuPaymentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TMenuPaymentInfo record, @Param("example") TMenuPaymentInfoExample example);

    int updateByExample(@Param("record") TMenuPaymentInfo record, @Param("example") TMenuPaymentInfoExample example);

    int updateByPrimaryKeySelective(TMenuPaymentInfo record);

    int updateByPrimaryKey(TMenuPaymentInfo record);
}