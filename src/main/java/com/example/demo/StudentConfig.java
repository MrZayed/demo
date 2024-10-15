package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner CommandLineRunner (StudentRepository repository){
        return args -> {
            Student kaream = new Student(
                    "kaream@gmial.com" ,
                    "kaream",
                    10
            );
            Student mariam = new Student(
                    "mariam@gmial.com" ,
                    "mariam",
                    20
            );
            Student saif = new Student(
                    "saif@gmial.com" ,
                    "saif",
                    10
            );

            repository.saveAll(
                    List.of(kaream, mariam, saif)
            );
        };
    };


}
