package com.consumer2.service_consumer2.controller;

import com.consumer2.service_consumer2.service.DateServiceFeignClientInterface;
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
@RequestMapping("/consumer")
public class DateServiceFeignController {
    @Resource
    private DateServiceFeignClientInterface anInterface;

    @GetMapping("/data")
    public String getData(@RequestParam String param){
        return anInterface.consumer(param);
    }
}
