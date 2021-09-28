package com.guxiu2008.demosvr.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author Allan X
 * \* @date: 2021/9/25
 * \* @time: 17:02
 * \* Description:
 * \
 */
@Component
public class DemoConfig {
    @Value("${title}")
    private String title;
}