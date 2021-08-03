package com.consumer2.service_consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer2Application.class, args);
    }

}
