package tk.mybatis.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.springboot.model.User;
import tk.mybatis.springboot.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IndexController {
    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public String home(){
        List<User> users = userService.selectAll();
        return "hello"+"\n"+" world";
    }
}
