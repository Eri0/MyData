package com.lkf.data.Service;

import com.lkf.data.Dao.jh.QjpfJhDao;
import com.lkf.data.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    QjpfJhDao qjpfJhDao;

    @Autowired
    UserService userService;
    @Test
    public void Insert() throws Exception {
        int userid = userService.InsertUser("es","sc");

    }
    @Test
    public void Select() throws Exception {
        int userid = 2;
        User user = userService.SelectUserById(userid);
        System.out.println(user);
    }
    @Test
    public void SelectSum() throws Exception {
        List<Map<Integer, Integer>> maps = qjpfJhDao.SumAndYear();
        //遍历map中的键

    }
}