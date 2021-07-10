package com.ecloudtime.controller;

import com.ecloudtime.entity.User;
import com.ecloudtime.servic.UserServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    public UserServiceImpl userServiceImpl;

    // 1.查询所有用户
    @GetMapping("/")
    public String findAll(Model model) {
        List<User> userList = userServiceImpl.find();
        model.addAttribute("users",userList);
        return "index";
    }

    // 2.0修改用户时根据id查询出的用户
    @GetMapping("/updatePage/{id}")
    public String update(@PathVariable int id,Model model) {
        User user = userServiceImpl.getById(id);
        model.addAttribute("user",user);
        return "update";
    }

    //2.1确认修改
    @PostMapping("/update")
    public String update(User user){
        int ret = userServiceImpl.updateUser(user);
        if (ret>0){
            System.out.println("修改成功");
        }else {

            System.out.println("修改失败");
        }
        return "redirect:/";
    }
    //3.添加弹出框
    @GetMapping("/useradd")
    public String toAdd(){
        return "add";
    }
    //3.1 开始进行添加
    @PostMapping("/add")
    public String add(User user){
        int ret = userServiceImpl.save(user);
        if (ret>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
        return "redirect:/";
    }
//    4.0 删除
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        int ret = userServiceImpl.removeById(id);
        if (ret>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        return "redirect:/";
    }
}
