package ru.frolov.springsecurity2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.frolov.springsecurity2db.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
