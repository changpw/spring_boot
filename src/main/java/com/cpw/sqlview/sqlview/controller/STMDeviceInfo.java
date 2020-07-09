package com.cpw.sqlview.sqlview.controller;

import com.cpw.sqlview.sqlview.pojo.StmDeviceinfo;
import com.cpw.sqlview.sqlview.pojo.StmDeviceinfoExample;
import com.cpw.sqlview.sqlview.service.STMDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@ResponseBody
@Controller
@RequestMapping(path = "/api/menu")
public class STMDeviceInfo {

    @Autowired
    STMDeviceService stmDeviceService;
    @GetMapping(path = "/device")
    public List<StmDeviceinfo> getStmDeviceService() {
        StmDeviceinfoExample stmDeviceinfoExample = new StmDeviceinfoExample();
        return stmDeviceService.getDeviceInfo(stmDeviceinfoExample);
    }
}
