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
            Student john = new Student("John", "john@email.com", LocalDate.of(2000, Month.JANUARY, 1));
            Student jerry = new Student("Jerry", "jerry@email.com", LocalDate.of(2001, Month.JANUARY, 1));
            Student bob = new Student("Bob", "bob@email.com", LocalDate.of(2002, Month.JANUARY, 1));
            repository.saveAll(
                    List.of(john, jerry, bob)
            );
        };
    }
}
