package com.sql.mapper;

import com.sql.bean.TOgBiJspPageInfo;
import com.sql.bean.TOgBiJspPageInfoExample;
import com.sql.bean.TOgBiJspPageInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOgBiJspPageInfoMapper {
    int countByExample(TOgBiJspPageInfoExample example);

    int deleteByExample(TOgBiJspPageInfoExample example);

    int deleteByPrimaryKey(String pangeUri);

    int insert(TOgBiJspPageInfoWithBLOBs record);

    int insertSelective(TOgBiJspPageInfoWithBLOBs record);

    List<TOgBiJspPageInfoWithBLOBs> selectByExampleWithBLOBs(TOgBiJspPageInfoExample example);

    List<TOgBiJspPageInfo> selectByExample(TOgBiJspPageInfoExample example);

    TOgBiJspPageInfoWithBLOBs selectByPrimaryKey(String pangeUri);

    int updateByExampleSelective(@Param("record") TOgBiJspPageInfoWithBLOBs record, @Param("example") TOgBiJspPageInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TOgBiJspPageInfoWithBLOBs record, @Param("example") TOgBiJspPageInfoExample example);

    int updateByExample(@Param("record") TOgBiJspPageInfo record, @Param("example") TOgBiJspPageInfoExample example);

    int updateByPrimaryKeySelective(TOgBiJspPageInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TOgBiJspPageInfoWithBLOBs record);

    int updateByPrimaryKey(TOgBiJspPageInfo record);
}