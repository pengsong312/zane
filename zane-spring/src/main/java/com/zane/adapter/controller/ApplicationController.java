package com.zane.adapter.controller;

import com.zane.adapter.dto.UserDTO;
import com.zane.application.inf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public int add(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return userService.add(name, age);
    }
}
