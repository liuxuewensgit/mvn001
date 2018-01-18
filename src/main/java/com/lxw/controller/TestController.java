package com.lxw.controller;

import com.lxw.dao.UserMapper;
import com.lxw.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {
    @Resource
    private UserMapper userMapper;
    @RequestMapping("user")
    @ResponseBody
    public List<User> getList(){
        User user = new User();
        user.setuName("testName");
        user.setPassWord("123");
        userMapper.insert(user);
       List<User> li = userMapper.selectAll();
        return  li;
    }

}/*public  static  void main(String[] args){
        System.out.println("qwe");
        System.out.println("from git hub test message");
        System.out.println("from git hub test message1");
    }*/


