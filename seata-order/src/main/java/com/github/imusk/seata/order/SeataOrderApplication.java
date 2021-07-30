package com.github.imusk.seata.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Musk
 * @email: muskcool@protonmail.com
 * @datetime: 2021-07-30 12:35
 * @classname: SeataOrderApplication
 * @description: 启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.github.imusk.seata.order.mapper")
public class SeataOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderApplication.class);
    }

}
