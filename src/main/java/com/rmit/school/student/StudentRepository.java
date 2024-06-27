package com.rmit.school.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findStudentByEmail(String email);
}
