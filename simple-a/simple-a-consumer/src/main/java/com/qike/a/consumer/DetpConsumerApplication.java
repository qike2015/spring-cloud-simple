package com.qike.a.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 豆丁
 * @since 2018/12/5
 */
@EnableFeignClients(basePackages="com.buke.service")
@EnableEurekaClient
@SpringBootApplication
public class DetpConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DetpConsumerApplication.class, args);
    }

}
