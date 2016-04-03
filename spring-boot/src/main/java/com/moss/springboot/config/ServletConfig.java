package com.moss.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(value="com.moss", useDefaultFilters=false, includeFilters = {
        @ComponentScan.Filter(value= Controller.class, type = FilterType.ANNOTATION),
        @ComponentScan.Filter(value= RestController.class, type = FilterType.ANNOTATION)
    })
@Configuration
public class ServletConfig {

}
