package com.netease.accidence.debug.service;

import com.netease.accidence.debug.dao.DebugDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DebugService {

@Autowired
private DebugDao debugDao;

public String getMsg(String paramMsg) {
    
    String resultStr= debugDao.getMsg();
    return paramMsg + " [" + resultStr + "] ";
}

}
