package com.rmit.school.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student quang = new Student(
                "Quang", // Name
                "QuangAcero@gmail.com", // Email
                LocalDate.of(2003, Month.SEPTEMBER, 29)// Date of Birth
		    );
            Student hung = new Student(
                "Hung", // Name
                "hung@gmail.com", // Email
                LocalDate.of(2004, Month.SEPTEMBER, 29)// Date of Birth
               
		    );
            Student kiet = new Student(
                "Kiet", // Name
                "kiet@gmail.com", // Email
                LocalDate.of(2005, Month.SEPTEMBER, 29)// Date of Birth
            
		    );
            repository.saveAll(
                List.of(quang, hung, kiet)
            );
        };
    }
    
}
