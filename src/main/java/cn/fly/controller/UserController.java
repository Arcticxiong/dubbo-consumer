package cn.fly.controller;

import cn.fly.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: dubbo-consumer
 * @description:
 * @author: Arctic_Xiong
 * @create: 2018-06-04 20:33
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;
    /***
     * 实现远程调用
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/name")
    public String getUserName(){
        return userService.getUserName();
    }
}
