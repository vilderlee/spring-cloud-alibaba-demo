package com.vilderlee.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/10/9      Create this file
 * </pre>
 */
@FeignClient("dubbo-provider")
public interface HelloService {

    @GetMapping("/say")
    String say(@RequestParam("words")String words);
}
