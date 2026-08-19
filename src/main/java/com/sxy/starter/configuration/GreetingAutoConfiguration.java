package com.sxy.starter.configuration;

import com.sxy.starter.service.DefaultGreetingService;
import com.sxy.starter.service.GreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// GreetingAutoConfiguration.java
@Configuration(proxyBeanMethods = false)  // 自动配置推荐关闭代理提升性能
public class GreetingAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(GreetingService.class)
    public GreetingService defaultGreetingService() {
        return new DefaultGreetingService();
    }

    @Bean
    public CommandLineRunner greetingRunner(GreetingService greetingService) {
        return args -> {
            System.out.println("=== Greeting: " + greetingService.getGreeting() + " ===");
        };
    }
}