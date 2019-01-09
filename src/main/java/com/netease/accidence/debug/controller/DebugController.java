package com.netease.accidence.debug.controller;

import com.netease.accidence.debug.service.DebugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/debug")
public class DebugController {


@Autowired
private DebugService debugService;

public String addAnotherMsg (String paramMsg) {
    return "这个方法添加额外的信息" + paramMsg;
}

@RequestMapping(value = "/getMsg/{paramMsg}", method = RequestMethod.GET)
public Map<String, Object> debug(@PathVariable(value = "paramMsg") String paramMsg) {
    
    String msg = debugService.getMsg(this.addAnotherMsg(paramMsg));
    
    Boolean isTrue = true;
    
    Object obj = null;
    
    // System.out.println(obj.toString());
    
    if (isTrue) {
        System.out.println("这是真的");
    }
    
    Map<String, Object> result = new HashMap<>();
    result.put("msg", msg);
    result.put("success", true);
    
    if (paramMsg.equals("go")) {
        result.put("go", isTrue);
    }
    
    return result;
}

}
