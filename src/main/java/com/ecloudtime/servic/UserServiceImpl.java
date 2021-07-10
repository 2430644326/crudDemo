package com.ecloudtime.servic;

import com.ecloudtime.mapper.UserMapper;
import com.ecloudtime.entity.User;



import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Resource
    public UserMapper userMapper;


    @Override
    public List<User> find() {
        List<User> userList = userMapper.find();
        return userList;
    }

    @Override
    public int removeById(int id) {
        return userMapper.removeById(id);
    }

    @Override
    public User getById(int id) {
        User user = userMapper.getById(id);
        return user;
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
    @Override
    public int save(User user) {
       return userMapper.save(user);

    }




}
