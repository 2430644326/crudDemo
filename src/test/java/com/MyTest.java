package com;

import com.ecloudtime.DemoApplication;
import com.ecloudtime.controller.UserController;
import com.ecloudtime.mapper.UserMapper;
import com.ecloudtime.servic.UserService;
import com.ecloudtime.servic.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


//@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class MyTest {
    @Resource
    UserController userController;
    @Test
    public void test(){


    }
}
