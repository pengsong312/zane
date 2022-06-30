package com.zane.controller;

import com.zane.application.inf.UserService;
import com.zane.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: ps
 * @since: 2022/6/30  3:35 PM
 * @version: 1.0.0
 */
@RestController
@RequestMapping("application")
public class ApplicationController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/list")
    public List<UserDTO> list() {
        return userService.list();
    }

    @RequestMapping("/user/add")
    public UserDTO add(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return userService.add(name, age);
    }
}
