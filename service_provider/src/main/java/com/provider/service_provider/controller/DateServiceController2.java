package com.provider.service_provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.IDateService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gaoyongkun
 * @version 1.0
 * @date 2021/8/3 15:57
 * @description 说明
 */
@RestController
public class DateServiceController2 implements IDateService {

    @Override
    public String cc(String param) {
        return "hello again, " + new SimpleDateFormat("yyyy年MM月dd日-HH:mm:ss").format(new Date());
    }
}
