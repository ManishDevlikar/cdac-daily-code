package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com")
@EnableAspectJAutoProxy
public class CountDownConfig {

}
