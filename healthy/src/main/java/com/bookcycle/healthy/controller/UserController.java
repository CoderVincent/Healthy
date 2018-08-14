package com.bookcycle.healthy.controller;

import com.bookcycle.healthy.dao.UserDao;
import com.bookcycle.healthy.pojo.User;
import com.bookcycle.healthy.vo.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    public UserDao userDao;

    /**
     * 注册
     * @param name
     * @param password
     * @param hospitalId
     * @param sex
     * @param age
     * @param phone
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String regist(@RequestParam String name,
                         @RequestParam String password,
                         @RequestParam String hospitalId,
                         @RequestParam Integer sex,
                         @RequestParam Integer age,
                         @RequestParam String phone,Model model){
        String timestamp = String.valueOf(System.currentTimeMillis());
        User user = new User(name,timestamp,hospitalId,password,sex,age,phone);
        userDao.saveUser(user);
        model.addAttribute("hospitalId",hospitalId);
        return "survey";
    }

    /**
     * 登录
     * @param hospitalId
     * @param password
     * @return
     */
    @RequestMapping(value = "/loginIdentify",method = RequestMethod.POST)
    public String login(@RequestParam String hospitalId, @RequestParam String password,Model model){
        User user = userDao.queryUserByHospitalId(hospitalId);
        LoginResult loginResult = new LoginResult();
        if(user.getHospitalId() == null || user.getHospitalId().equals("")){
            loginResult.setResponseCode("4003");
            loginResult.setDescription("用户不存在");
            return "NotExistAccount";
        }else {
            if(!user.getPassword().equals(password)){
                loginResult.setDescription("4002");
                loginResult.setDescription("密码错误");
                return "pwdError";
            }else{
                loginResult.setResponseCode("4001");
                loginResult.setDescription("登录成功");
            }
        }
        model.addAttribute("hospitalId",hospitalId);
        return "survey";
    }
}
