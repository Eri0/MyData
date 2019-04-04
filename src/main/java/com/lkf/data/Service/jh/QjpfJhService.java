package com.lkf.data.Service.jh;


import com.lkf.data.Dao.jh.QjpfJhDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QjpfJhService {
    @Autowired
    QjpfJhDao qjpfJhDao;

     public List<Map<Integer,Integer>> SumAndYear(){
        List<Map<Integer, Integer>> maps = qjpfJhDao.SumAndYear();
        return maps;
//        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

}
     public  List<Map<Integer,Integer>>SumAndDistrict(){
         List<Map<Integer, Integer>> maps = qjpfJhDao.SumAndDistrct();
         return maps;
     }
}
