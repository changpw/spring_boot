package com.cpw.sqlview.sqlview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "/api/table")
@ResponseBody
public class STMTableSearch {
    @GetMapping(path = "/mainTables/{id}")
    public List<Map<String,Object>> getMainTable(@PathVariable String id){
        System.out.println(id);
        List<Map<String, Object>> maps = new ArrayList<>() ;
        Map<String, Object> map = new HashMap<>();
        map.put("AAA",id);
        maps.add(map);
        return maps;
    }
}
