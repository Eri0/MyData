package com.lkf.data.Controller;


import com.lkf.data.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public  String test(Map<Object,Object>map){
        map.put("name","es");


        return "Main";
    }

    @RequestMapping("/loadEs")
    public  String LoadEcharts(){
        return  "Exp";
    }

    @RequestMapping("/LoadSc")
    public String LoadEcharts2(){
        return  "Exp2";
    }

}
