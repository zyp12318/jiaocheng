package com.yykjc.jiaochendemo.user.contrller;

import com.yykjc.jiaochendemo.user.entity.UserEntity;
import com.yykjc.jiaochendemo.user.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/*
@RestController = @ResponseBody + @Controller
 */
@Controller
@RequestMapping("user")
public class Usercontrller {
    @Autowired
    Userservice userservice;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map) {
        return userservice.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id){
     userservice.delById(id);
     return "redirect:/index.html";

    }

    //保存用户
    @RequestMapping("/save")

    //不加 @ResponseBody 报错404
    //
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {
        System.out.println("用户注册 -"+userEntity.toString());
        userservice.save(userEntity);
        return "success";
    }

    //根据id查询用户信息
    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserById (Integer id) {
        return userservice.getUserById(id);
    }

    //根据id修改用户信息
    @RequestMapping("/updataUserById")
    @ResponseBody
    public String updataUserById(@RequestBody UserEntity userEntity){
        userservice.updataUserById(userEntity);
        return "success";

    }
}
