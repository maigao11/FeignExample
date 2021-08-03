package com.server.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  注册服务中心
 *  https://mp.weixin.qq.com/s?__biz=MzU4ODI1MjA3NQ==&mid=2247483887&idx=1&sn=6d4b191dc992ea27bf8602eefd323383&chksm=fdded72bcaa95e3ddbe74c3c1cebd524d17dd6e58c01e387ce04d3994bac694b40c505732441&mpshare=1&scene=23&srcid=0803ysTAN63rsqE1AGcJY4hf&sharer_sharetime=1627967809073&sharer_shareid=4f2968be841fa508f8202b35e690295d#rd
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
