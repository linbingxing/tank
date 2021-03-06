package com.tank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
  * @description 启动类
  * @author lbx
  * @date 2019/11/2 16:41
  * @version 1.0.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class TankAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(TankAdminApplication.class,args);
    }
}
