package com.vilderlee.provider;

import com.vilderlee.api.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }



    @Service
    public class HelloServiceImpl implements HelloService {
        @Override public String say(String words) {
            return "Hi~ " + words;
        }
    }
}
