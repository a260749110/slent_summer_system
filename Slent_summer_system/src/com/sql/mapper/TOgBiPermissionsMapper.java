package com.sql.mapper;

import com.sql.mapperXml.TOgBiPermissions;
import com.sql.mapperXml.TOgBiPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOgBiPermissionsMapper {
    int deleteByPrimaryKey(String name);

    int insert(TOgBiPermissions record);

    int insertSelective(TOgBiPermissions record);

    List<TOgBiPermissions> selectByExampleWithBLOBs(TOgBiPermissionsExample example);

    List<TOgBiPermissions> selectByExample(TOgBiPermissionsExample example);

    TOgBiPermissions selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") TOgBiPermissions record, @Param("example") TOgBiPermissionsExample example);

    int updateByExampleWithBLOBs(@Param("record") TOgBiPermissions record, @Param("example") TOgBiPermissionsExample example);

    int updateByExample(@Param("record") TOgBiPermissions record, @Param("example") TOgBiPermissionsExample example);

    int updateByPrimaryKeySelective(TOgBiPermissions record);

    int updateByPrimaryKeyWithBLOBs(TOgBiPermissions record);
}