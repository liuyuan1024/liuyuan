package cn.itcast.controller;


import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
   @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
public String findAll(Model model){
    System.out.println("表现层：查询所有账户。。。");
    //调用service的方法
        List<User> list=userService.findAll();
        model.addAttribute("list",list);
    return "list";
}

}
