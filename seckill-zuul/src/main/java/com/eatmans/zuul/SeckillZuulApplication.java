package com.eatmans.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/5/26
 */

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SeckillZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillZuulApplication.class, args);
    }


}
