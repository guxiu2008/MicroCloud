package com.guxiu2008.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author Allan X
 * \* @date: 2021/9/13
 * \* @time: 20:07
 * \* Description:
 * \
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
