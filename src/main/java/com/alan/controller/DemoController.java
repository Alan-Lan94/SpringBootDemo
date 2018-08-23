package com.alan.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final Log logger = LogFactory.getLog(DemoController.class);

    @RequestMapping("/demo")
    public Map demo() {

        logger.info("进入demo方法");

        Map<Object, Object> map = new HashMap<>();

        map.put("desc", "hello word！");

        return map;

    }

    @RequestMapping("/string")
    public String string() {

        logger.info("进入string方法");

        return "hello word~~";
    }

}
