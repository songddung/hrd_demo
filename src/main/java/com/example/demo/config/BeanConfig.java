package com.example.demo.config;

import java.util.Calendar;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.Game;

@Configuration
// @ImportResource("classpath:application.xml")
@ComponentScan(basePackages = "com.example.demo")
@ComponentScan(basePackageClasses = BeanConfig.class)
public class BeanConfig {
    @Bean
    public String bean1() {
        return new String("bean 1");
    }

    @Bean
    public Random bean2() {
        return new Random();
    }

    @Bean
    public Calendar bean3() {
        return Calendar.getInstance();
    }

    @Bean
    public Game game() {
        return new Game();
    }
}
