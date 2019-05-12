package net.lengmang.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider")
public interface NacosProviderService {

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message") String message);
}
