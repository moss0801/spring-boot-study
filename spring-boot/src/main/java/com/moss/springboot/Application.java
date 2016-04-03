package com.moss.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;

import com.moss.springboot.config.RootConfig;
import com.moss.springboot.config.ServletConfig;

@Configuration
public class Application {
 
    public static void main(String[] args) {
        SpringApplication.run(new Object[] {RootConfig.class, ServletConfig.class}, args);
    }
   
}
