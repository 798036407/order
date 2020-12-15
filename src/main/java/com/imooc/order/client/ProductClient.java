package com.imooc.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: cz
 * Date： 2020/12/15 22:52
 * 客户端访问服务端接口
 */
@FeignClient(name = "product")
public interface ProductClient {

    /**
     * 访问服务端msg
     * @return
     */
    @GetMapping("/msg")
    String productMsg();
}
