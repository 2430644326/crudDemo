package com.ecloudtime.mapper;


import com.ecloudtime.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository

public interface UserMapper {

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
