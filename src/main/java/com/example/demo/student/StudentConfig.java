package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mohammad = new Student(
                    "Mohammad",
                    "mohammad.hashemi747@gmail.com",
                    LocalDate.of(1994, Month.OCTOBER, 20),
                    26
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 20),
                    21
            );
            repository.saveAll(
                    List.of(mohammad, alex)
            );
        };
    }
}
