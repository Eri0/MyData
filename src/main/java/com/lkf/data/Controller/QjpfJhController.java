package com.lkf.data.Controller;


import com.lkf.data.Service.jh.QjpfJhService;
import com.lkf.data.Util.FastJsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class QjpfJhController {
    @Autowired
    QjpfJhService qjpfJhService;

    @RequestMapping("/SumAndYear")
    @ResponseBody
    public  String CountSY(){
        List<Map<Integer, Integer>> maps = qjpfJhService.SumAndYear();
        return FastJsonUtil.getBeanToJson(maps);
    }

    @RequestMapping("/SumAndDistrict")
    @ResponseBody
    public  String CountSD(){
        List<Map<Integer, Integer>> maps = qjpfJhService.SumAndDistrict();
        return FastJsonUtil.getBeanToJson(maps);
    }
}
