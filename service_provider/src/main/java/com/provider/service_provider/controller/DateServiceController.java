package com.provider.service_provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoyongkun
 * @version 1.0
 * @date 2021/8/3 15:57
 * @description 说明
 */
@RestController
public class DateServiceController {
    @GetMapping("/test")
    public String get(@RequestParam String param) {
        return "你找到我了, " + param;
    }
}
