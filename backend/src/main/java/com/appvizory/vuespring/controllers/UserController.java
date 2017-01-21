package com.appvizory.vuespring.controllers;

import com.appvizory.vuespring.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tmukhe001c on 1/20/2017.
 */
@Controller
public class UserController {

    @RequestMapping("/api/user")
    @ResponseBody
    public User fetchUser(){
        User user = new User();
        user.setUsername("Hello user ! This information came from the server.");
        return user;
    }
}
