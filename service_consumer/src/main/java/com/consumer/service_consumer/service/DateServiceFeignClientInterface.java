package com.consumer.service_consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.IDateService;

/**
 * @author gaoyongkun
 * @version 1.0
 * @date 2021/8/3 16:57
 * @description 说明
 */
@FeignClient(value = "service-provider")
public interface DateServiceFeignClientInterface {
    @GetMapping("/test")
    String consumer(@RequestParam String param);
}
