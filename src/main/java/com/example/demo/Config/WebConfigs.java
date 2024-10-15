package com.example.demo.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigs implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Adjust the path as needed
                .allowedOrigins("http://localhost:3000") // Allow your front-end
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Adjust methods as needed
                .allowedHeaders("*")
                .allowCredentials(true); // If you need to include credentials
    }
}


