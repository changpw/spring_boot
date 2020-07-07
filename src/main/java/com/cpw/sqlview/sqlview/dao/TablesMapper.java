package com.cpw.sqlview.sqlview.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
@Mapper
public interface TablesMapper {
    @Select("select * from STM_SERIAL_NUMBER where SERIALNUMBER1 like '%${id}%' ")
    List<Map<String, Object>> getTableData(String id);
}
