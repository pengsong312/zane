package com.zane.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ps
 * @since: 2022/6/30  3:20 PM
 * @version: 1.0.0
 */
@RestController
@RequestMapping("/hello")
public class HelloWordController {

    @RequestMapping("/word")
    public String hello(@RequestParam String word) {
        return word + " hello word !";
    }
}
