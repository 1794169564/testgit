package com.lz.test;

import com.alibaba.fastjson.JSONObject;
import com.lz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/")
    public String tologin(){
        return "index1";
    }

    @RequestMapping("/checkName")
    @ResponseBody
    public String checkUserName(){
        User user = new User();
        user.setUserid(1);
        user.setUserName("王五");
        user.setPwd("123456");
        String json = JSONObject.toJSONString(user);
        System.out.println(json);
        return json;
    }

}


