package ru.frolov.springsecurity2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.frolov.springsecurity2db.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
