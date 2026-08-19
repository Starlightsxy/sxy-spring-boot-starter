package com.sxy.starter.service;

/**
 * @author 洁心未眠
 * @Package com.sxy.starter.service
 * @date 2026/8/19 19:19
 */
public class DefaultGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "hello world";
    }
}
