package com.jong960107.ngle_internProject1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@PropertySource("/message/messages.properties")
public class MainProperties implements WebMvcConfigurer {






}
