package ru.frolov.springsecurity2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.frolov.springsecurity2db.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
