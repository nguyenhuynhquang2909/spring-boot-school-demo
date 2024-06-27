package com.rmit.school;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmit.school.student.Student;

@SpringBootApplication
@RestController
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}
	

}
