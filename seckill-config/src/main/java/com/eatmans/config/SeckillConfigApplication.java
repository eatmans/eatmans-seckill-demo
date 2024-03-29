package com.eatmans.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SeckillConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillConfigApplication.class, args);
    }

}
