package ru.jmentor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.jmentor.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
