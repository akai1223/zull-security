package com.zek.zull.example;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * description：
 *
 * @author zhangkai
 * @date 2020/12/30 16:04
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"com.zek.**.mapper"})
@EnableFeignClients(basePackages = "com.zek.**")
public class ZullSecurityExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZullSecurityExampleApplication.class, args);
    }
}
