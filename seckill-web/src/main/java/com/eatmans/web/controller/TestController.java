package com.eatmans.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return "hello test";
    }
}
