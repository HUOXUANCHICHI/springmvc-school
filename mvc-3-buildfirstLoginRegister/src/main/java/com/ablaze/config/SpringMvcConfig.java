package com.ablaze.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//3.创建springmvc的配置文件，加载controller对应的bean
//springmvc配置类，本质上还是一个spring配置类
@Configuration
@ComponentScan("com.ablaze.web")
@EnableWebMvc
public class SpringMvcConfig {
}
