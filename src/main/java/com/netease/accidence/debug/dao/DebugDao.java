package com.netease.accidence.debug.dao;

import com.netease.accidence.debug.service.DebugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DebugDao {
    
    public String getMsg() {
        return "数据库信息...";
    }
    
}
