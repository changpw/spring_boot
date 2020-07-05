package com.cpw.sqlview.sqlview.controller;

import com.cpw.sqlview.sqlview.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping(path = "/api/menu")
@ResponseBody
public class STMTableSearch {
    @Autowired
    TableService tableService ;

    public STMTableSearch(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping(path = "/mainTables/{id}")
    public List<Map<String,Object>> getMainTable(@PathVariable String id){
        System.out.println(new Date());
        List<Map<String,Object>> maps= new ArrayList<>();
        
       return tableService.getTableService(id);

    }
    @GetMapping(path = "/test/{id}")
    public  Map<String,Object> getSqlResult(@PathVariable String id){
        HashMap<String, Object> hashMap = new HashMap<>();
        System.out.println(id);
        hashMap.put("id",id);
        return hashMap;
    }
}

