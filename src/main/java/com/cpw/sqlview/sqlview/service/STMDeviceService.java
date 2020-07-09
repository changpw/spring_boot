package com.cpw.sqlview.sqlview.service;

import com.cpw.sqlview.sqlview.dao.StmDeviceinfoMapper;
import com.cpw.sqlview.sqlview.pojo.StmDeviceinfo;
import com.cpw.sqlview.sqlview.pojo.StmDeviceinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings({"SpringJavaAutowiredFieldsWarningInspection", "SpringJavaInjectionPointsAutowiringInspection"})
@Service
public class STMDeviceService {
    @Autowired
    StmDeviceinfoMapper stmDeviceinfoMapper;

    public List<StmDeviceinfo> getDeviceInfo(StmDeviceinfoExample stmDeviceinfoExample){
        return  stmDeviceinfoMapper.selectByExample(stmDeviceinfoExample);
    }
}
