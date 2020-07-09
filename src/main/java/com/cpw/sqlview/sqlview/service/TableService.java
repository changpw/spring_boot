package com.cpw.sqlview.sqlview.service;

import com.cpw.sqlview.sqlview.dao.StmSerialNumberMapper;
import com.cpw.sqlview.sqlview.dao.TablesMapper;
import com.cpw.sqlview.sqlview.pojo.StmSerialNumber;
import com.cpw.sqlview.sqlview.pojo.StmSerialNumberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TableService {
    @Autowired
    TablesMapper tablesMapper;
    @Autowired
    StmSerialNumberMapper StmSerialNumberMapper;
    public List<Map<String,Object>> getTableService(String id){
        System.out.println(id);
        return tablesMapper.getTableData(id);
    }
    public List<StmSerialNumber> getSTMSerilaById(StmSerialNumberExample stmSerialNumberExample ){
        return StmSerialNumberMapper.selectByExample(stmSerialNumberExample);
    }
}
