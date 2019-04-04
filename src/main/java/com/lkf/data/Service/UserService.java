package com.lkf.data.Service;


import com.lkf.data.Dao.UserDao;
import com.lkf.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    int InsertUser(String username,String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userDao.addUser(user);

        return user.getUserid();
    }
    User SelectUserById(int userid){
        User user =  userDao.SelectUserById(userid);
        return  user;
    }
}
