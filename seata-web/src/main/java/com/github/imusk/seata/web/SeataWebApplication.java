package com.github.imusk.seata.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 13:04
 * @classname: SeataWebApplication
 * @description: SeataWebApplication
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.github.imusk.seata.web.feign")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SeataWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataWebApplication.class);
    }

}
