package com.guxiu2008.demosvr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author Allan X
 * \* @date: 2021/9/27
 * \* @time: 16:11
 * \* Description:
 * \
 */
@RestController
@RequestMapping("/DemoTest")
public class DemoTestController {

    @Value("${title}")
    private String title;

    @RequestMapping("/Demo")
    public String DemoTest() {
        return title;
    }
}