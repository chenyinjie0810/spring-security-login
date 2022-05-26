package com.zhaoxi.springsecuritylogin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.web.DefaultSecurityFilterChain;

@SpringBootApplication
@Slf4j
public class SpringSecurityLoginApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringSecurityLoginApplication.class, args);

        DefaultSecurityFilterChain filterChain = context.getBean(DefaultSecurityFilterChain.class);
        log.info("{}", filterChain);
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            Object bean = context.getBean(beanDefinitionName);
//            log.info("{}", bean);
//        }
    }

}
