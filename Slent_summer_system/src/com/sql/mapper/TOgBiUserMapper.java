package com.sql.mapper;

import com.sql.mapperXml.TOgBiUser;
import com.sql.mapperXml.TOgBiUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOgBiUserMapper {
    int deleteByPrimaryKey(String user);

    int insert(TOgBiUser record);

    int insertSelective(TOgBiUser record);

    List<TOgBiUser> selectByExampleWithBLOBs(TOgBiUserExample example);

    List<TOgBiUser> selectByExample(TOgBiUserExample example);

    TOgBiUser selectByPrimaryKey(String user);

    int updateByExampleSelective(@Param("record") TOgBiUser record, @Param("example") TOgBiUserExample example);

    int updateByExampleWithBLOBs(@Param("record") TOgBiUser record, @Param("example") TOgBiUserExample example);

    int updateByExample(@Param("record") TOgBiUser record, @Param("example") TOgBiUserExample example);

    int updateByPrimaryKeySelective(TOgBiUser record);

    int updateByPrimaryKeyWithBLOBs(TOgBiUser record);
}