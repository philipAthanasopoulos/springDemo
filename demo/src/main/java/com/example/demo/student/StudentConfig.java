package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.JANUARY;

/**
 * @author Philip Athanasopoulos
 */
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student george = new Student(
                    "George",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "george@gmail.com"
            );
            Student mike = new Student(
                    "Mike",
                    LocalDate.of(2003, Month.JANUARY, 5),
                    "mike@gmail.com"
            );

            studentRepository.saveAll(
                    List.of(george,mike)
            );
        };
    }
}
