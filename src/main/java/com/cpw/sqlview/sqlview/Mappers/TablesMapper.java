package com.cpw.sqlview.sqlview.Mappers;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
public interface TablesMapper {
    @Select("select * from STM_SERIAL_NUMBER where SERIALNUMBER1 like '%${id}%' ")
    List<Map<String, Object>> getTableData(String id);
}
