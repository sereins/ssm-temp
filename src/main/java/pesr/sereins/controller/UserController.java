package pesr.sereins.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pesr.sereins.pojo.User;
import pesr.sereins.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    public String list(Model model){

        List<User> users = userService.queryAll();

        model.addAttribute("list",users);
        return "user";
    }
}
