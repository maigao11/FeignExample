package service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gaoyongkun
 * @version 1.0
 * @date 2021/8/3 17:20
 * @description 说明
 */
public interface IDateService {
    @GetMapping("/api/test")
    String cc(@RequestParam("param") String param);
}
