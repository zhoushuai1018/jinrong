package com.bw.controller;

import com.bw.pojo.User;
import com.bw.service.UserService;
import com.bw.util.MD5Util;
import com.bw.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    private List findAll(){
        return userService.findAll();
    }

    @RequestMapping("/login")
    public User login(@RequestBody User user){
        User login = userService.getUserByUsername(user);
        System.out.println(login);
        //û������, ���ش�����Ϣ
        if (login==null){
            User user1 = new User();
            user1.setUpwd("0");
            return user1;
        }
        //�����û�����
        if (MD5Util.input2db(user.getUpwd(),login.getUsalt()).equals(login.getUpwd())){
            return login;
        }else {  //��֤ʧ��
            User user1 = new User();
            user1.setUpwd("0");
            return user1;
        }

    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        String salt = UUIDUtil.uuid();
        user.setUsalt(salt);
        user.setUpwd(MD5Util.input2db(user.getUpwd(),salt));
        userService.addUser(user);
        return "ok";
    }

    @RequestMapping("/findByUid")
    public User findByUid(@RequestParam("uid")long uid){

        return userService.findByUid(uid);
    }

}
