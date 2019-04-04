package com.lkf.data.Dao;

import com.lkf.data.model.*;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {
        String TABLE_NAME = "user";
        String INSET_FIELDS = " username, password";
        String SELECT_FIELDS = " userid, username, password";

    @Insert({"insert into ", TABLE_NAME, "(", INSET_FIELDS,
            ") values (#{username},#{password})"})
    int addUser(User user);

    @Select({"select", SELECT_FIELDS,"from ",TABLE_NAME ,"where userid=#{userid}"})
    User SelectUserById(int userid);

}