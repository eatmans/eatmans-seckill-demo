package com.eatmans.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class SeckillAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillAdminApplication.class, args);
    }

}
