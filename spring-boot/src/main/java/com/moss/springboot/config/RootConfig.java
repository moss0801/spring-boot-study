package com.moss.springboot.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(value="com.moss", useDefaultFilters=false, includeFilters = {
    @ComponentScan.Filter(value= Service.class, type = FilterType.ANNOTATION),
    @ComponentScan.Filter(value= Repository.class, type = FilterType.ANNOTATION)
})
@EnableAutoConfiguration
public class RootConfig {

}
