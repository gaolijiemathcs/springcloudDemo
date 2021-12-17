package com.gao.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    // @LoadBalanced注解赋予RestTemplate负载均衡的能力 能够自动将rest请求打到同一个服务下面的某一个端口上
    // ApplicationContextConfig在配置中进行定义
    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
// applicationContext.xml <bean id="" class="">
