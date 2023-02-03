package com.revature.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.revature.services","com.revature.repos","com.revature.aspects"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
}
