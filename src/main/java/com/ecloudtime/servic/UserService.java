package com.ecloudtime.servic;

import com.ecloudtime.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    //      查询全部
    List<User> find();
    //     根据id删除
    int removeById(int id);
    //      根据idcha
    User getById(int id);
    //      修gai
    int updateUser(User user);
    //      添加
    int save(User user);



}
