package com.cpw.sqlview.sqlview.service;

import com.cpw.sqlview.sqlview.Mappers.TablesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TableService {
    @Autowired
    TablesMapper tablesMapper;
    public List<Map<String,Object>> getTableService(String id){
        System.out.println(id);
        return tablesMapper.getTableData(id);
    }
}
