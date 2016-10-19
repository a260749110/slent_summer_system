package com.sql.mapper;

import com.sql.mapperBean.SVip;
import com.sql.mapperBean.SVipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SVipMapper {
    int countByExample(SVipExample example);

    int deleteByExample(SVipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SVip record);

    int insertSelective(SVip record);

    List<SVip> selectByExampleWithBLOBs(SVipExample example);

    List<SVip> selectByExample(SVipExample example);

    SVip selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SVip record, @Param("example") SVipExample example);

    int updateByExampleWithBLOBs(@Param("record") SVip record, @Param("example") SVipExample example);

    int updateByExample(@Param("record") SVip record, @Param("example") SVipExample example);

    int updateByPrimaryKeySelective(SVip record);

    int updateByPrimaryKeyWithBLOBs(SVip record);

    int updateByPrimaryKey(SVip record);
}