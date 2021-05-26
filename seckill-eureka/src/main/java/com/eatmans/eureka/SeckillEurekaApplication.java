package com.eatmans.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */

@SpringBootApplication
@EnableEurekaServer
public class SeckillEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillEurekaApplication.class, args);
    }

}
