package com.consumer.service_consumer.controller;

import com.consumer.service_consumer.service.DateServiceFeignClientInterface;
import com.consumer.service_consumer.service.DateServiceFeignClientInterface2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author gaoyongkun
 * @version 1.0
 * @date 2021/8/3 16:59
 * @description 说明
 */
@RestController
@RequestMapping("/consumer2")
public class DateServiceFeignController2 {
    /*@Resource
    private DateServiceFeignClientInterface2 anInterface;

    @GetMapping("/data")
    public String getData(@RequestParam String param){
        return anInterface.cc(param);
    }*/
}
